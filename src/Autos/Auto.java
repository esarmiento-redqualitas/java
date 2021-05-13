package Autos;

/**
 * @author Equipo 1
 */

public class Auto {

    private int numSerie;
    private String marca;
    private String color;
    private int fabricacion;
    private boolean velocidadCrucero;

    /**
     * Constructor por defecto
     */

    public Auto() {
    }

    /**
     * Constructor con dos parametros
     *
     * @param numSerie describe el numero de serie del auto
     * @param marca    describe la marca del auto
     */

    public Auto(int numSerie, String marca) {
        this.numSerie = numSerie;
        this.marca = marca;
    }

    /**
     * Constructor con cinco parametros
     *
     * @param numSerie         describe el numero de serie del auto
     * @param marca            describe la marca del auto
     * @param color            describe el color del auto
     * @param fabricacion      describe el año de fabricacion
     * @param velocidadCrucero describe si tiene velocidad crucero
     */

    public Auto(int numSerie, String marca, String color, int fabricacion, boolean velocidadCrucero) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.color = color;
        this.fabricacion = fabricacion;
        this.velocidadCrucero = velocidadCrucero;
    }

    /**
     * Metodo get
     *
     * @return retorna el numero de serie
     */

    public int getNumSerie() {
        return numSerie;
    }

    /**
     * Metodo get
     *
     * @return retorna la marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo get
     *
     * @return retorna el color
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo get
     *
     * @return retorna el año de fabricacion
     */
    public int getFabricacion() {
        return fabricacion;
    }

    /**
     * Metodo get
     *
     * @return retorna si tiene velocidad crucero o no
     */
    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    /**
     * Metodo set
     *
     * @param numSerie modifica el numero de serie
     */
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Metodo set
     *
     * @param marca modifica la marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo set
     *
     * @param color modifica el color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo set
     *
     * @param fabricacion modifica el año de fabricacion
     */
    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    /**
     * Metodo set
     *
     * @param velocidadCrucero modifica la velocidad crucero
     */
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    /**
     * Metodo que retorna el precio del vehiculo
     *
     * @return retorna el precio del articulo auto
     */
    public double calcularPrecio() {
        double precioArticulo = 0;
        switch (marca) {
            case "Kia":
                precioArticulo = fabricacion * 10;
                break;
            case "Citroen":
                precioArticulo = fabricacion * 10;
                break;
            case "Volskwagen":
                precioArticulo = fabricacion * 9;
                break;
            case "Hyundai":
                precioArticulo = fabricacion * 8;
                break;
            case "Peugeot":
                precioArticulo = fabricacion * 8;
                break;
            case "Fiat":
                precioArticulo = fabricacion * 8;
                break;
            case "Susuky":
                precioArticulo = fabricacion * 8;
                break;
            case "Chevrolet":
                precioArticulo = fabricacion * 8;
                break;
            case "Renault":
                precioArticulo = fabricacion * 7;
                break;
            case "Chery":
                precioArticulo = fabricacion * 7;
                break;
        }

        if (velocidadCrucero == true) ;
        {
            precioArticulo = precioArticulo + 700;
        }

        return precioArticulo;

    }

    /**
     * Metodo que retorna un string
     *
     * @return retorna un string haciendo mencion a la velocidad crucero
     */

    public String veloCrucero() {
        if (velocidadCrucero == true) {
            return "Tiene velocidad crucero";
        } else {
            return "No tiene velocidad crucero";
        }
    }
}





