/**@author Gabriel Machado
 * @author Jorge Scotti
 * Clase Autos
 */

public class Autos {
    private int serie;
    private String marca;
    private String color;
    private int fabricacion;
    private boolean velCrucero;
    /**
     * Variable usdMarca: almacena el coeficiente que se multiplica por el año de fabricación del auto dependiendo de la marca
     */
    private int usdMarca;

    /**
     * Constructor por defecto de la clase Autos
     */
    public Autos() {
    }

    /**
     *
     * @param serie almacena el número de serie de cada auto
     * @param marca almacena la marca de cada auto
     */
    public Autos(int serie, String marca) {
        this.serie = serie;
        this.marca = marca;
    }

    /**
     *
     * @param serie
     * @param marca
     * @param color almacena el color de cada auto
     * @param fabricacion almacena el año de fabricación de cada auto
     * @param velCrucero almacena valores de tipo "true" ó "false" para indicar si cada auto cuenta o no con velocidad crucero
     */
    public Autos(int serie, String marca, String color, int fabricacion, boolean velCrucero) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.fabricacion = fabricacion;
        this.velCrucero = velCrucero;
    }

    /**
     *
     * @return devuelve el número de serie
     */
    public int getSerie() {
        return serie;
    }

    /**
     *
     * @return devuelve la marca del auto
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @return devuelve el color de auto
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return devuelve el año de fabricación del auto
     */
    public int getFabricacion() {
        return fabricacion;
    }

    /**
     *
     * @return devuelve un valor true o false para indicar si el auto cuenta con velocidad crucero
     */
    public boolean getVelCrucero() {
        return velCrucero;
    }

    /**
     *
     * @return devueve el coeficiente usdMarca que varía según la marca de cada auto
     * devuelve valor cero si la marca es nula ó diferente a las que se encuentran en este método
     */
    public int getUsdMarca() {
        if (getMarca().equals("Kia")) {
            return usdMarca = 10;
        } else if (getMarca().equals("Citroen")) {
            return usdMarca = 10;
        } else if (getMarca().equals("Volkswagen")) {
            return usdMarca = 9;
        } else if (getMarca().equals("Hyundai")) {
            return usdMarca = 8;
        } else if (getMarca().equals("Peugeot")) {
            return usdMarca = 8;
        } else if (getMarca().equals("Fiat")) {
            return usdMarca = 8;
        } else if (getMarca().equals("Suzuki")) {
            return usdMarca = 8;
        } else if (getMarca().equals("Chevrolet")) {
            return usdMarca = 8;
        } else if (getMarca().equals("Renault")) {
            return usdMarca = 7;
        } else if (getMarca().equals("Chery")) {
            return usdMarca = 7;
        } else {
            return usdMarca = 0;
        }
    }

        /**
        * permite modificar el numero de serie de cada auto
        * @param serie
        */
        public void setSerie ( int serie){
            this.serie = serie;
        }

        /**
        * permite modificar la marca de los autos
        * @param marca
        */
        public void setMarca (String marca){
            this.marca = marca;
        }

    /**
     * permite modificar el color de cada auto
     * @param color
     */
    public void setColor (String color){
            this.color = color;
        }

    /**
     * permite modificar el año de fabricación de cada auto
     * @param fabricacion
     */
    public void setFabricacion ( int fabricacion){
            this.fabricacion = fabricacion;
        }

    /**
     * permite cambiar el valor verdadero o falso de la velocidad crucero de cada auto
     * @param velCrucero
     */
        public void setVelCrucero ( boolean velCrucero){
            this.velCrucero = velCrucero;
        }

    /**
     * método para calcular el precio final de cada auto
     * @return devuelve el precio definitivo de los auto
     */
        public int precioFinal () {if (velCrucero){return (getUsdMarca() * getFabricacion()) + 700;}
        else {return getUsdMarca() * getFabricacion();}
        }


}


