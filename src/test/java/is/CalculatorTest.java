package is;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.fraction.calculator.Calculator.*;
import static ru.fraction.calculator.Fraction.convert;

public class CalculatorTest {

  @Test
  public void testCalculatorSum() {
    assertEquals("2/3", sum(convert("1/3"), convert("1/3")).toString());
    assertEquals("5/7", sum(convert("2/7"), convert("3/7")).toString());
    assertEquals("3 2/3", sum(convert("1 2/9"), convert("2 4/9")).toString());
    assertEquals("2 26/99", sum(convert("-2/11"), convert("2 4/9")).toString());
    assertEquals("-1 1/5", sum(convert("-2/5"), convert("-4/5")).toString());
    assertEquals("0", sum(convert("1/2"), convert("-0.5")).toString());
    assertEquals("6 9/20", sum(convert("4"), convert("2.45")).toString());
  }

  @Test
  public void testCalculatorMinus() {
    assertEquals("1/3", minus(convert("2/3"), convert("1/3")).toString());
    assertEquals("3/7", minus(convert("5/7"), convert("2/7")).toString());
    assertEquals("52/77", minus(convert("9/11"), convert("1/7")).toString());
    assertEquals("4 1/2", minus(convert("5"), convert("1/2")).toString());
    assertEquals("5 1/2", minus(convert("5"), convert("-0.5")).toString());
    assertEquals("-4 1/2", minus(convert("-5"), convert("-1/2")).toString());
    assertEquals("0", minus(convert("7/8"), convert("7/8")).toString());
  }

  @Test
  public void testCalculatorMultiply() {
    assertEquals("4/21", multiply(convert("1/3"), convert("4/7")).toString());
    assertEquals("3 10/27", multiply(convert("4 1/3"), convert("7/9")).toString());
    assertEquals("-4/21", multiply(convert("-4/7"), convert("1/3")).toString());
    assertEquals("0", multiply(convert("1/2"), convert("0")).toString());
    assertEquals("0", multiply(convert("0"), convert("1/3")).toString());
    assertEquals("3 1/10", multiply(convert("2"), convert("1.55")).toString());
    assertEquals("1 139/150", multiply(convert("5.78"), convert("1/3")).toString());
  }

  @Test
  public void testCalculatorDivide() {
    assertEquals("1", divide(convert("1/3"), convert("1/3")).toString());
    assertEquals("2 1/7", divide(convert("5/7"), convert("1/3")).toString());
    assertEquals("-2 1/7", divide(convert("5/7"), convert("-1/3")).toString());
    assertEquals("-2 1/7", divide(convert("-5/7"), convert("1/3")).toString());
    assertEquals("2 1/7", divide(convert("-5/7"), convert("-1/3")).toString());
    assertEquals("20/1", divide(convert("5"), convert("1/4")).toString());
    assertEquals("4 3/8", divide(convert("1.25"), convert("2/7")).toString());
  }
}
