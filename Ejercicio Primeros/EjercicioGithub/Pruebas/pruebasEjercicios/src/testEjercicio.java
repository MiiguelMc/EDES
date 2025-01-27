import org.junit.Assert;
import org.junit.Test;
public class testEjercicio {
    @Test
    calculadora miCalc = new calculadora();
    Assert.assertThrows(ArithmeticException.class,() -> miCalc.division(5,0));
    }