import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.junit.Test;

public class ServicioNotificacionTest{
    @Test
    public void enviarnotificacion(){
    ProvedorNotificaciones mockProved= mock(ProvedorNotificaciones.class);
    ServicioNotificacion miServ = new ServicioNotificacion(mockProved);
    miServ.ProvedorNotificaciones("hola");
    verify(mockProved).enviarNotificacion("hola");
}
}