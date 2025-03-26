public class ServicioLogin {
    private RepositoriosUsuarios miRepositorio;
    public ServicioLogin(RepositoriosUsuarios miRepo){
    miRepositorio = miRepo;
    }
    public boolean login(String nombre){
        return miRepositorio.existeUsuario(nombre);
    }
}
