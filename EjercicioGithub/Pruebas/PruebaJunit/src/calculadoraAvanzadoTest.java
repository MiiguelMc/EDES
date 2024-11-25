import org.junit.Test;
import org.junit.Assert; 
public class calculadoraAvanzadoTest {
    @Test
    public void potencia(){
            calculadoraAvanzada calculadora = new calculadoraAvanzada(); 
            Assert.assertEquals(4,calculadoraAvanzada.potencia(2, 2),0.001);
            Assert.assertEquals(0.25,calculadoraAvanzada.potencia(2, -2),0.001);
            Assert.assertNotEquals(0.125,calculadoraAvanzada.potencia(-2, -3),0.001);
    }
    @Test
    public void raizcuadrada(){
        
        calculadoraAvanzada calculadora = new calculadoraAvanzada();
        Assert.assertThrows(IllegalArgumentException.class,()->calculadoraAvanzada.raizcuadrada(-1));
        Assert.assertEquals(2.23606797749979,calculadoraAvanzada.raizcuadrada(5),0.001);
        Assert.assertEquals(1.4142135623730951,calculadoraAvanzada.raizcuadrada(2),0.001);
    }
}