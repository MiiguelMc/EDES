public class calculadora  {
    public static int division (int a , int b){
        if (b==0) throw new  ArithmeticException("No se puede dividir entre 0");
            return (a/b);
    }
}
