import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class CPIFP implements Serializable {
    private String nombre;
    private String direccion;
    private int telf;
    private String nomFich;

    public CPIFP(String nombre, String direccion, int telf, String nomFich) {
        this.nombre = nombre;
        this.telf = telf;
        this.direccion = direccion;
        this.nomFich = nomFich;
    }

    public String serializar(Object object) {
        return ((Estudiante) object).getNombre() + ";" + ((Estudiante) object).getId();
    }

    public Object deserializar(String linea) {
        String[] datos = linea.split(";");
        Estudiante pepe = new Estudiante(Integer.parseInt(datos[1]), datos[0]);
        return pepe;
    }

    public boolean añadirEstudiante(int id, String nom) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nomFich, true));
            String pepe = serializar(new Estudiante(id, nom));
            bw.write(pepe + "\n");
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean quitar(int id) {
        try {
            String linea = "";
            File original = new File(nomFich);
            File mod = new File(nomFich + ".tmp");
            original.renameTo(mod);
            BufferedWriter bw = new BufferedWriter(new FileWriter(nomFich, true));
            BufferedReader br = new BufferedReader(new FileReader(nomFich + ".tmp"));
            linea = br.readLine();
            while (linea != null) {
                Estudiante estudiante = (Estudiante) deserializar(linea);
                if (id == estudiante.getId()) {

                } else {
                    bw.write(linea + "\n");
                }
                linea = br.readLine();
            }

            bw.close();
            br.close();
            mod.delete();
        } catch (IOException IO) {
            System.out.println(IO.getMessage());
        }
        return true;
    }

    public boolean modificar(int id, String nom) {
        try {
            String linea = "";
            File original = new File(nomFich);
            File mod = new File(nomFich + ".tmp");
            original.renameTo(mod);
            BufferedWriter bw = new BufferedWriter(new FileWriter(nomFich, true));
            BufferedReader br = new BufferedReader(new FileReader(nomFich + ".tmp"));
            linea = br.readLine();
            while (linea != null) {
                Estudiante estudiante = (Estudiante) deserializar(linea);
                if (id == estudiante.getId()) {

                    estudiante = new Estudiante(id, nom);
                    bw.write(serializar(estudiante) + "\n");
                } else {
                    bw.write(linea + "\n");
                }
                linea = br.readLine();
            }

            bw.close();
            br.close();
            mod.delete();
        } catch (IOException IO) {
            System.out.println(IO.getMessage());
        }
        return true;
    }

    public String obtenerEst(int id) {
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(nomFich))) {
                String linea = "";
                while (linea != null) {
                    linea = br.readLine();
                    Estudiante estudiante = (Estudiante) deserializar(linea);
                    if (id == estudiante.getId()) {
                        return linea;
                    }
                }
                br.close();
            }
        } catch (Exception e) {
            return "id";
        }
        return null;
    }

    public String listarEstudiante() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomFich));
            String linea = "";
            String total = "";
            while (linea != null) {
                linea = br.readLine();
                total += linea + "\n";

            }
            br.close();
            return total;
        } catch (Exception e) {
            System.out.println("Error");
        }
        return null;

    }
}
