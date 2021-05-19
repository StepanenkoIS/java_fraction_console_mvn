package is;


import org.junit.Test;

import static org.junit.Assert.*;
import ru.fraction.calculator.Fraction;



public class FractionTest {

  @Test
  public void testFractionCreate() {

    assertNotNull(Fraction.convert(5));
    assertNotNull(Fraction.convert(2.8));
    assertNotNull(Fraction.convert("8/9"));
  }

  @Test (expected = NumberFormatException.class)
  public void testFractionException() {
    assertNotNull(Fraction.convert(""));
    assertNotNull(Fraction.convert("423dafd4t3"));
    assertNotNull(Fraction.convert("1-7/2"));
    assertNotNull(Fraction.convert("--1 7/2"));
  }

  @Test
  public void testFractionConvertInt(){
    assertEquals(new Fraction(1,0,0), Fraction.convert(0));
    assertEquals(new Fraction(1,1,1), Fraction.convert(1));
    assertEquals(new Fraction(1,2,1), Fraction.convert(2));
    assertEquals(new Fraction(1,3,1), Fraction.convert(3));
    assertEquals(new Fraction(1,10,1), Fraction.convert(10));
    assertEquals(new Fraction(-1,15,1), Fraction.convert(-15));
    assertEquals(new Fraction(-1,9875,1), Fraction.convert(-9875));
  }

  @Test
  public void testFractionConvertDouble() {
    assertEquals(new Fraction(1,0,0), Fraction.convert(0.0));
    assertEquals(new Fraction(1,1,10), Fraction.convert(0.1));
    assertEquals(new Fraction(1,1,1,2), Fraction.convert(1.5));
    assertEquals(new Fraction(-1,10, 3,10), Fraction.convert(-10.3));
    assertEquals(new Fraction(-1,11, 901,1000), Fraction.convert(-11.901));
  }

  @Test
  public void testFractionConvertString(){
    assertEquals(new Fraction(1, 0, 0), Fraction.convert("0"));
    assertEquals(new Fraction(1, 1, 2), Fraction.convert("1/2"));
    assertEquals(new Fraction(-1, 1, 20), Fraction.convert("-1/20"));
    assertEquals(new Fraction(1, 4, 3, 4), Fraction.convert("4 3/4"));
    assertEquals(new Fraction(-1, 7, 1, 5), Fraction.convert("-7 1/5"));
    assertEquals(new Fraction(-1, 3, 1), Fraction.convert("-3"));
    assertEquals(new Fraction(1, 17, 1), Fraction.convert("17"));
    assertEquals(new Fraction(1, 3, 57, 100), Fraction.convert("3.57"));
    assertEquals(new Fraction(-1, 17, 1, 10), Fraction.convert("-17.1"));
  }

  @Test
  public void testFractionEuclid() {
    assertEquals("1/2", Fraction.convert("50/100").toString());
    assertEquals("3/5", Fraction.convert("18/30").toString());
    assertEquals("3/7", Fraction.convert("2616/6104").toString());
    assertEquals("5 7/15", Fraction.convert("1394/255").toString());
    assertEquals("-17 89759/125678789", Fraction.convert("-17 89759/125678789").toString());
    assertEquals("-5 501/5000", Fraction.convert("-5.1002").toString());
  }

}
