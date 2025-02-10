class GestorCPIFP {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("error");
        } else {
            CPIFP miCentro = new CPIFP("pepe", "calle calle", 5235, args[0]);
            miCentro.añadirEstudiante(101, "Miguel");
            miCentro.añadirEstudiante(102, "Jose");
            miCentro.añadirEstudiante(103, "Adrian");
            miCentro.añadirEstudiante(104, "Pepe");
            miCentro.añadirEstudiante(106, "Carlos");
            System.out.println("---------------------------------------------");
            //A partir de aqui son test de los funcionamientos
            System.out.println(miCentro.listarEstudiante());
            System.out.println(miCentro.obtenerEst(101));
            miCentro.quitar(102);
            //Esto es para ver que se ha eliminado 
            System.out.println(miCentro.obtenerEst(102));

            miCentro.modificar(101, "Cristian");
            //Aqui es para comprobar el cambio de nombre 
            System.out.println(miCentro.obtenerEst(101));
        }
    }

}
