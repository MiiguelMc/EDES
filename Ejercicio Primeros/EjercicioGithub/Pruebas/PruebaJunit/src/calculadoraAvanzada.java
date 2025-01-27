public class calculadoraAvanzada {
    public static double potencia(double base , int exponente){
        return(Math.pow(base, exponente));
        
    }
    public static double raizcuadrada(double radicando){
        if (radicando<0) throw new IllegalArgumentException("Tu radicando es menor a 0");
        return(Math.sqrt(radicando));
        
    }
}