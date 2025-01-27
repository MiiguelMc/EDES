public class Car {
    /**
     * La clase representa un modelo de coche
     * Tiene atributos como el modelo , marca , año de fabricacion , y precio
     */
    private String make;
    /**
     * Su funcion es guardar la marca del modelo que nos indican
     */
    private String model;
    /**
     * Su funcion es guardar el modelo que nos indican
     */
    private int year;
    /**
     * Su funcion es guardar el año del modelo que nos indican
     */
    private double price;

    /**
     * Su funcion es guardar el precio del modelo que nos indican
     */

    public Car(String make, String model, int year, double price) {
        /**
         * Constructor de la clase Car.
         * 
         * @param make  La marca del coche.
         * @param model El modelo del coche.
         * @param year  El año de fabricación del coche.
         * @param price El precio del coche.
         */
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Obtiene la marca del coche.
     * 
     * @return La marca del coche.
     */
    public String getMake() {
        return make;

    }

    /**
     * Establece la marca del coche.
     * 
     * @param make La nueva marca del coche.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Obtiene el modelo del coche.
     * 
     * @return El modelo del coche.
     */
    public String getModel() {
        return model;
    }

    /**
     * Establece el modelo del coche.
     * 
     * @param model El nuevo modelo del coche.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Obtiene el año de fabricación del coche.
     * 
     * @return El año de fabricación del coche.
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece el año de fabricación del coche.
     * 
     * @param year El nuevo año de fabricación del coche.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Obtiene el precio del coche.
     * 
     * @return El precio del coche en dólares.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del coche.
     * 
     * @param price El nuevo precio del coche en dólares.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Genera una descripción del coche en formato de texto.
     * La descripción incluye el año, la marca, el modelo y el precio del coche.
     * 
     * @return Una cadena de texto con la descripción completa del coche.
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * Sobrescribe el método toString para devolver la descripción completa del
     * coche.
     * 
     * @return La descripción del coche generada por el método carDescription.
     */
    @Override
    public String toString() {
        return carDescription();
    }

    /**
     * Método principal para probar la clase Car.
     * 
     * @param args Argumentos de línea de comandos .
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}