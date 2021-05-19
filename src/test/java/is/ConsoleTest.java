package is;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import ru.fraction.calculator.*;

public class ConsoleTest {

  @Test
  public void testParseConsoleExpression() {
    assertEquals("1 1/4", Console.parseConsole("1/2 sum 3/4"));
    assertEquals("-1/4", Console.parseConsole("1/2 min 3/4"));
    assertEquals("3/8", Console.parseConsole("1/2 mul 3/4"));
    assertEquals("2/3", Console.parseConsole("1/2 div 3/4"));
  }

  @Test
  public void testParseConsoleConvert() {
    assertEquals("1/2", Console.parseConsole("1/2"));
    assertEquals("1/2", Console.parseConsole("0.5"));
    assertEquals("2/1", Console.parseConsole("2"));
    assertEquals("1/4", Console.parseConsole("10/40"));
  }

  @Test
  public void testParseConsoleInput() {
    assertEquals("3/5", Console.parseConsole("1/5 sum     2/5"));
    assertEquals("3/5", Console.parseConsole("1/5     sum2/5"));
    assertEquals("3/5", Console.parseConsole("1/5sum 2/5"));
    assertEquals("3/5", Console.parseConsole("1/5 sum2/5"));
    assertEquals("3/5", Console.parseConsole("1/5sum2/5"));
    assertEquals("3/5", Console.parseConsole("   1/5     sum2/5"));
    assertEquals("3/5", Console.parseConsole("  1/5   sum    2/5      "));
  }

}
