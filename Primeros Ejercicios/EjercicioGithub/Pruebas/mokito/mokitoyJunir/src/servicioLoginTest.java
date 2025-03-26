import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.Assert;

public class servicioLoginTest {
    @Test
    public void pruebaUsuarioExistente(){
    RepositoriosUsuarios miRepo= mock(RepositoriosUsuarios.class);
    when(miRepo.existeUsuario("Juan")).thenReturn(true);
    ServicioLogin miServicio = new ServicioLogin(miRepo);
    Assert.assertTrue(miServicio.login("Juan"));
}
}