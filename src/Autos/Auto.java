/**
 * @author Marcelo Gesto Juan gomez
 * Calse Auto con documentacion
 */
package Autos;

class Auto {
    private int numeroSerie;
    private String marca;
    private String color;
    private int fabricacion;
    private boolean velocidadCrucero;
    /**
     * contructor Auto
     */
    public Auto(){};
    /**
     *contructor de la clase Electrodosmiestico
     * @param numeroSerie peso del objecto Electrodomestico a crear
     * @param marca precio del Electrodomestico a crear
     */
    public Auto(int numeroSerie, String marca) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
    }

    /**
     *
     * @param numeroSerie del objeto a crear
     * @param marca del objeto a crear
     * @param color del objeto a crear
     * @param fabricacion del objeto a crear
     * @param velocidadCrucero del objeto a crear
     */
    public Auto(int numeroSerie, String marca, String color, int fabricacion, boolean velocidadCrucero) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.color = color;
        this.fabricacion = fabricacion;
        this.velocidadCrucero = velocidadCrucero;
    }

    /**
     *
     * @return devuleve numero de serie, color, marca, fabricacion, velocidad crucero
     */

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public boolean getvelocidadCrucero() {
        return velocidadCrucero;
    }

    /**
     * @set actualiza el valor numero de serie, marca, color, fabricacion, velocidad crucero
     */

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFabricacion(int fabricacion) {
        fabricacion = fabricacion;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    /**
     * @switch compara caso a caso segun marca y genera una operacion segun el caso
     */

    public double calcularPrecio() {
        double valorDeFabricacion = 0;
        switch (marca) {
            case "kia":
                valorDeFabricacion = 10 * fabricacion;
                break;
            case "Citroen":
                valorDeFabricacion = 10 * fabricacion;
                break;
            case "Volkswagen":
                valorDeFabricacion =  9 * fabricacion;
                break;
            case "Hyundai":
                valorDeFabricacion = 8 * fabricacion;
                break;
            case "Peugeot":
                valorDeFabricacion = 8 * fabricacion;
                break;
            case "Fiat":
                valorDeFabricacion = 8 * fabricacion;
                break;
            case "Suzuki":
                valorDeFabricacion = 8 * fabricacion;
                break;
            case "Chevrolet":
                valorDeFabricacion = 8 * fabricacion;
                break;
            case "Renault":
                valorDeFabricacion = 7 * fabricacion;
                break;
            case "Chery":
                valorDeFabricacion = 7 * fabricacion;
                break;
        }
/**
 * @if compara condicion si en caso de ser verdadera suma un valor, si es falsa devuelve el valor original
 */
        if (velocidadCrucero == true) {
            return valorDeFabricacion + 700;
        } else {
            return valorDeFabricacion;
        }

    }
}
