import java.util.Locale;

/**
 * Creador de autos: Precios, modelos, colores, calculo del precio total del auto al cliente
 *          @author Ignacio Alvarez- Walter Rendo
 */public class Auto{

   //Class variables
   private int numeroSerie;
   private int fabricacion;
   private String color;
   private String marca;
   private boolean velocidadCrucero;

    /** Constructor Auto por defecto, no ingresa datos, tipo de constructor polimorfico
     @author Ignacio Alvarez- Walter Rendo
     */
   //Constructor Auto por defecto
     Auto(){

    }
    /** Constructor Auto con los datos Numero de serie, y Marca)
     @param int String
     @author Ignacio Alvarez- Walter Rendo
     */
    //Constructor Auto Serie y Marca
     Auto(int numeroSerie, String marca){
        this.numeroSerie=numeroSerie;
        this.marca=marca;
    }
    /** Constructor Auto con los datos Numero de serie, marca, color, velocidad Crucero, fabricacion
     @param int int String String boolean
     @author Ignacio Alvarez- Walter Rendo
     */
   //Constructor Auto todos los atributos
     Auto(int numeroSerie,String marca,String color,int fabricacion,boolean velocidadCrucero){
        this.numeroSerie=numeroSerie;
        this.marca=marca;
        this.color=color;
        this.velocidadCrucero=velocidadCrucero;
        this.fabricacion=fabricacion;
    }

    /**
     @param  numeroSerie
     */
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    /**
     @param  fabricacion
     */
    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }
    /**
     @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     @param velocidadCrucero
     */
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    /**
     @return numeroSerie
     */
    public int getNumeroSerie() {
        return numeroSerie;
    }
    /**
     @return int fabricacion
     */
    public int getFabricacion() {
        return fabricacion;
    }
    /**
     @return String color
     */
    public String getColor() {
        return color;
    }
    /**
     @return String marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     @return int velocidadCrucero
     */
    public boolean getVelocidadCrucero() {
        return velocidadCrucero;
    }

    /**
     metodo precio del Auto
     @return precioAuto
     */

    //Method precio del auto
    public double precioAuto(){

        double precioAuto = 0;

        switch (marca){

            case "Kia":
                precioAuto = fabricacion * 10;
                break;
            case "Citroen":
                precioAuto = fabricacion * 10;
                break;
            case "Volkswagen":
                precioAuto = fabricacion * 9;
                break;
            case "Hyundai":
                precioAuto = fabricacion * 8;
                break;
            case "Chevrolet":
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
            case "Renault":
                precioAuto = fabricacion * 7;
                break;
            case "Chery":
                precioAuto = fabricacion * 7;
                break;
        }
        if(velocidadCrucero){
           precioAuto = precioAuto + 700;
        }
        return precioAuto;
    }
}

