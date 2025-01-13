public class ServicioNotificacion {
    private ProvedorNotificaciones miProvedor;
    public ServicioNotificacion(ProvedorNotificaciones miNotifi){
    miProvedor = miNotifi;
    }
    public void ProvedorNotificaciones(String nombre){
        miProvedor.enviarNotificacion(nombre);
    }
}
