/**
 * @author Luis Machado y Jorge Perez
 */

public class Auto {
    /**
     * atributos iniciales
     */
    private int numeroDeSerie;
    private String marca;
    private String color;
    private int fabricacion;
    private boolean velocidadCrucero;

    /**
     * constructor publico vacio
     */
    public Auto() {

    }

    /**
     * contrucctor publico que toma dos atribusto
     *
     * @param numeroDeSerie
     * @param marca
     */
    public Auto(int numeroDeSerie, String marca) {
        this.numeroDeSerie = numeroDeSerie;
        this.marca = marca;

    }

    /**
     * contructor publico q toma 5 atributos
     *
     * @param numeroDeSerie
     * @param marca
     * @param color
     * @param fabricacion
     * @param velocidadCrucero
     */
    public Auto(int numeroDeSerie, String marca, String color, int fabricacion, boolean velocidadCrucero) {
        this.numeroDeSerie = numeroDeSerie;
        this.marca = marca;
        this.color = color;
        this.fabricacion = fabricacion;
        this.velocidadCrucero = velocidadCrucero;
    }

    /**
     * metodos get para cada atributo iniciales
     *
     * @return nos devuelve el valor de cada atributo
     */
    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public boolean getvelocidadCrucero() {
        return velocidadCrucero;
    }


    /**
     * metodos set para cada atributo inicial
     *
     * @param 'no' devuelve nada solo actualiza los valoresde los atrivitos intermanmente
     */
    public void setNumeroDeSerie(int nuevoNumeroDeSerie) {
        this.numeroDeSerie = nuevoNumeroDeSerie;
    }

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void setFabricacion(int nuevoFabricacion) {
        this.fabricacion = nuevoFabricacion;
    }

    public void setVelocidadCrucero(boolean nuevolVelocidadCrucero) {
        this.velocidadCrucero = nuevolVelocidadCrucero;
    }

    /**
     * caculo de precion con variables switch marcas en funcion de precio
     *
     * @return dependeiendo del los valores ingresados por consola nos calcula el precio
     */
    public double calcularPrecio() {
        double precioAuto = 0;
        switch (marca) {
            case "Kia":
                precioAuto = fabricacion * 10;
                break;
            case "Citroen":
                precioAuto = fabricacion * 10;
                break;
            case "Volkswangen":
                precioAuto = fabricacion * 9;
                break;
            case "Hyundai":
                precioAuto = fabricacion * 8;
                break;
            case "Peugeot":
                precioAuto = fabricacion * 8;
                break;
            case "Fiat":
                precioAuto = fabricacion * 8;
                break;
            case "Suzuki":
                precioAuto = fabricacion * 8;
                break;
            case "Chevrolet":
                precioAuto = fabricacion * 8;
                break;
            case "Renault":
                precioAuto = fabricacion * 7;
                break;
            case "Chery":
                precioAuto = fabricacion * 7;
                break;


        }

        if (velocidadCrucero == true) {
            precioAuto = precioAuto + 700;
        } else if (velocidadCrucero == false) {
            precioAuto = precioAuto;
        }

        return precioAuto;
    }
}


