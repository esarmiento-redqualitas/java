import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ignacio Alvarez- Walter Rendo
 * @version 1.0
 */
public class Ejercicio {

     /** Creador de autos: Precios, modelos, colores, calculo del precio total del auto al cliente
         @author Ignacio Alvarez- Walter Rendo
         @return ArrayList de 5 autos
      * @exception NullPointerException enseña error al ingreso de datos no estipulado, numericos o alfabeticos,
      * no puede exceder las fechas de 1990 al año actual,
      * solo se aceptan los colores de la lista, solo los autos de la lista,y solo si el auto tiene velocidad crucero
      * (aceptando solo las sentencias "Si" y "No")
      * @see Auto
     */
   public static ArrayList<Auto> creacionAutos() {

        Scanner scan = new Scanner(System.in);
        ArrayList<Auto> autos = new ArrayList<Auto>();

        int numeroSerie;
        int fabricacion;
        String color;
        String marca;
        boolean velocidadCrucero;

        /** Instancia auto 1 **/
        System.out.println("Ingrese los valores para auto numero 1: ");

        //Ingreso de numero de serie
        System.out.println("Ingresar numero de serie: ");

        String userIn1 = scan.nextLine();

        if(userIn1.length() < 5){
            numeroSerie = Integer.parseInt(userIn1);
        } else {
            throw new NullPointerException("El numero de serie no puede exceder los 4 caratectes numericos.");
        }

        //Ingreso de año de fabricacion
        System.out.println("Ingresar año de fabricacion: ");

        String userIn2 = scan.nextLine();

        if(userIn2.matches("^[1]+[9]+[9]+[0-9]$") || userIn2.matches("^[2]+[0]+[0-2]+[0-9]$")
                && !userIn2.matches("^[2]+[0]+[2]+[2-9]$")){
            fabricacion = Integer.parseInt(userIn2);
        } else {
            throw new NullPointerException("El año de fabricacion debe ser entre 1990 y año actual.");
        }

        //Ingreso de color
        System.out.println("A continuacion se le brindara una lista de colores disponibles para su vehiculo: ");

        System.out.println("-Rojo \n" +
                "-Azul \n" +
                "-Negro \n" +
                "-Blanco \n" +
                "-Plateado");

        System.out.println("Ingrese un color correspondiente a la lista anterior: ");

        String userIn3 = scan.nextLine();

        if (userIn3.equalsIgnoreCase("Rojo") || userIn3.equalsIgnoreCase("Azul")
                || userIn3.equalsIgnoreCase("Negro") || userIn3.equalsIgnoreCase("Blanco")
                || userIn3.equalsIgnoreCase("Plateado")) {
            color = userIn3.substring(0, 1).toUpperCase() + userIn3.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los colores brindados en la lista.");
        }

        //Ingreso de modelo
        System.out.println("A continuacion se le brindara una lista de modelos vehiculo disponibles: ");

        System.out.println("-Kia \n" +
                "-Citroen \n" +
                "-Volkswagen \n" +
                "-Hyundai \n" +
                "-Chevrolet \n" +
                "-Peugeot \n" +
                "-Fiat \n" +
                "-Suzuki \n" +
                "-Renault \n" +
                "-Chery");

        System.out.println("Ingrese la marca de vehiculo deseada: ");

        String userIn4 = scan.nextLine();

        if (userIn4.equalsIgnoreCase("Kia") || userIn4.equalsIgnoreCase("Citroen")
                || userIn4.equalsIgnoreCase("Volkswagen") || userIn4.equalsIgnoreCase("Hyundai")
                || userIn4.equalsIgnoreCase("Chevrolet") || userIn4.equalsIgnoreCase("Peugeot")
                || userIn4.equalsIgnoreCase("Fiat") || userIn4.equalsIgnoreCase("Suzuki")
                || userIn4.equalsIgnoreCase("Renault") || userIn4.equalsIgnoreCase("Chery")) {
            marca = userIn4.substring(0, 1).toUpperCase() + userIn4.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los modelos brindados en la lista.");
        }

        //Confirmacion de velocidad crucero
        System.out.println("Es velocidad crucero? ");
        String userIn5 = scan.nextLine();

        if (userIn5.equalsIgnoreCase("Si")) {
            velocidadCrucero = true;
        } else if (userIn5.equalsIgnoreCase("No")) {
            velocidadCrucero = false;
        } else {
            throw new NullPointerException("Solo se aceptan los valores 'Si' o 'No'");
        }

        Auto auto = new Auto(numeroSerie,marca,color,fabricacion,velocidadCrucero);

        autos.add(auto);

        System.out.println("Ingrese los valores para auto numero 2: ");

        System.out.println("Ingresar numero de serie: ");

        userIn1 = scan.nextLine();

        if(userIn1.length() < 5){
            numeroSerie = Integer.parseInt(userIn1);
        } else {
            throw new NullPointerException("El numero de serie no puede exceder los 4 caratectes numericos.");
        }

        System.out.println("Ingresar año de fabricacion: ");

        userIn2 = scan.nextLine();

        //Condicional del año de fabricacion
        if(userIn2.matches("^[1]+[9]+[9]+[0-9]$") || userIn2.matches("^[2]+[0]+[0-2]+[0-9]$")
                && !userIn2.matches("^[2]+[0]+[2]+[2-9]$")){
            fabricacion = Integer.parseInt(userIn2);
        } else {
            throw new NullPointerException("El año de fabricacion debe ser entre 1990 y año actual.");
        }

        System.out.println("A continuacion se le brindara una lista de colores disponibles para su vehiculo: ");

        System.out.println("-Rojo \n" +
                "-Azul \n" +
                "-Negro \n" +
                "-Blanco \n" +
                "-Plateado");

        System.out.println("Ingrese un color correspondiente a la lista anterior: ");

        userIn3 = scan.nextLine();

        //Confirmacion de color
        if (userIn3.equalsIgnoreCase("Rojo") || userIn3.equalsIgnoreCase("Azul")
                || userIn3.equalsIgnoreCase("Negro") || userIn3.equalsIgnoreCase("Blanco")
                || userIn3.equalsIgnoreCase("Plateado")) {
            color = userIn3.substring(0, 1).toUpperCase() + userIn3.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los colores brindados en la lista.");
        }

        System.out.println("A continuacion se le brindara una lista de modelos vehiculo disponibles: ");

        //Modelos disponibles
        System.out.println("-Kia \n" +
                "-Citroen \n" +
                "-Volkswagen \n" +
                "-Hyundai \n" +
                "-Chevrolet \n" +
                "-Peugeot \n" +
                "-Fiat \n" +
                "-Suzuki \n" +
                "-Renault \n" +
                "-Chery");

        System.out.println("Ingrese la marca de vehiculo deseada: ");

        userIn4 = scan.nextLine();

        if (userIn4.equalsIgnoreCase("Kia") || userIn4.equalsIgnoreCase("Citroen")
                || userIn4.equalsIgnoreCase("Volkswagen") || userIn4.equalsIgnoreCase("Hyundai")
                || userIn4.equalsIgnoreCase("Chevrolet") || userIn4.equalsIgnoreCase("Peugeot")
                || userIn4.equalsIgnoreCase("Fiat") || userIn4.equalsIgnoreCase("Suzuki")
                || userIn4.equalsIgnoreCase("Renault") || userIn4.equalsIgnoreCase("Chery")) {
            marca = userIn4.substring(0, 1).toUpperCase() + userIn4.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los modelos brindados en la lista.");
        }

        System.out.println("Es velocidad crucero? ");
        userIn5 = scan.nextLine();

        //Condicional sobre la velocidad crucero
        if (userIn5.equalsIgnoreCase("Si")) {
            velocidadCrucero = true;
        } else if (userIn5.equalsIgnoreCase("No")) {
            velocidadCrucero = false;
        } else {
            throw new NullPointerException("Solo se aceptan los valores 'Si' o 'No'");
        }

        Auto auto2 = new Auto(numeroSerie,marca,color,fabricacion,velocidadCrucero);

       autos.add(auto2);


        System.out.println("Ingrese los valores para auto numero 3: ");

        System.out.println("Ingresar numero de serie: ");

        userIn1 = scan.nextLine();

        if(userIn1.length() < 5){
            numeroSerie = Integer.parseInt(userIn1);
        } else {
            throw new NullPointerException("El numero de serie no puede exceder los 4 caratectes numericos.");
        }

        System.out.println("Ingresar año de fabricacion: ");

        userIn2 = scan.nextLine();

        //Condicional del año de fabricacion
        if(userIn2.matches("^[1]+[9]+[9]+[0-9]$") || userIn2.matches("^[2]+[0]+[0-2]+[0-9]$")
                && !userIn2.matches("^[2]+[0]+[2]+[2-9]$")){
            fabricacion = Integer.parseInt(userIn2);
        } else {
            throw new NullPointerException("El año de fabricacion debe ser entre 1990 y año actual.");
        }

        System.out.println("A continuacion se le brindara una lista de colores disponibles para su vehiculo: ");

        //Confirmacion de colores
        System.out.println("-Rojo \n" +
                "-Azul \n" +
                "-Negro \n" +
                "-Blanco \n" +
                "-Plateado");

        System.out.println("Ingrese un color correspondiente a la lista anterior: ");

        userIn3 = scan.nextLine();

        if (userIn3.equalsIgnoreCase("Rojo") || userIn3.equalsIgnoreCase("Azul")
                || userIn3.equalsIgnoreCase("Negro") || userIn3.equalsIgnoreCase("Blanco")
                || userIn3.equalsIgnoreCase("Plateado")) {
            color = userIn3.substring(0, 1).toUpperCase() + userIn3.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los colores brindados en la lista.");
        }

        System.out.println("A continuacion se le brindara una lista de modelos vehiculo disponibles: ");

        //Lista de autos disponibles
        System.out.println("-Kia \n" +
                "-Citroen \n" +
                "-Volkswagen \n" +
                "-Hyundai \n" +
                "-Chevrolet \n" +
                "-Peugeot \n" +
                "-Fiat \n" +
                "-Suzuki \n" +
                "-Renault \n" +
                "-Chery");

        System.out.println("Ingrese la marca de vehiculo deseada: ");

        userIn4 = scan.nextLine();

        if (userIn4.equalsIgnoreCase("Kia") || userIn4.equalsIgnoreCase("Citroen")
                || userIn4.equalsIgnoreCase("Volkswagen") || userIn4.equalsIgnoreCase("Hyundai")
                || userIn4.equalsIgnoreCase("Chevrolet") || userIn4.equalsIgnoreCase("Peugeot")
                || userIn4.equalsIgnoreCase("Fiat") || userIn4.equalsIgnoreCase("Suzuki")
                || userIn4.equalsIgnoreCase("Renault") || userIn4.equalsIgnoreCase("Chery")) {
            marca = userIn4.substring(0, 1).toUpperCase() + userIn4.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los modelos brindados en la lista.");
        }

        System.out.println("Es velocidad crucero? ");
        userIn5 = scan.nextLine();

        //Condicional de velocidad crucero
        if (userIn5.equalsIgnoreCase("Si")) {
            velocidadCrucero = true;
        } else if (userIn5.equalsIgnoreCase("No")) {
            velocidadCrucero = false;
        } else {
            throw new NullPointerException("Solo se aceptan los valores 'Si' o 'No'");
        }

        Auto auto3 = new Auto(numeroSerie,marca,color,fabricacion,velocidadCrucero);

        autos.add(auto3);


        System.out.println("Ingrese los valores para auto numero 4: ");

        System.out.println("Ingresar numero de serie: ");

        userIn1 = scan.nextLine();

        if(userIn1.length() < 5){
            numeroSerie = Integer.parseInt(userIn1);
        } else {
            throw new NullPointerException("El numero de serie no puede exceder los 4 caratectes numericos.");
        }

        System.out.println("Ingresar año de fabricacion: ");

        userIn2 = scan.nextLine();

        //Condicional del año de fabricacion
        if(userIn2.matches("^[1]+[9]+[9]+[0-9]$") || userIn2.matches("^[2]+[0]+[0-2]+[0-9]$")
                && !userIn2.matches("^[2]+[0]+[2]+[2-9]$")){
            fabricacion = Integer.parseInt(userIn2);
        } else {
            throw new NullPointerException("El año de fabricacion debe ser entre 1990 y año actual.");
        }

        System.out.println("A continuacion se le brindara una lista de colores disponibles para su vehiculo: ");
        //Listado de colores disponibles
        System.out.println("-Rojo \n" +
                "-Azul \n" +
                "-Negro \n" +
                "-Blanco \n" +
                "-Plateado");

        System.out.println("Ingrese un color correspondiente a la lista anterior: ");

        userIn3 = scan.nextLine();

        if (userIn3.equalsIgnoreCase("Rojo") || userIn3.equalsIgnoreCase("Azul")
                || userIn3.equalsIgnoreCase("Negro") || userIn3.equalsIgnoreCase("Blanco")
                || userIn3.equalsIgnoreCase("Plateado")) {
            color = userIn3.substring(0, 1).toUpperCase() + userIn3.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los colores brindados en la lista.");
        }

        System.out.println("A continuacion se le brindara una lista de modelos vehiculo disponibles: ");

        //Lista de autos disponibles
        System.out.println("-Kia \n" +
                "-Citroen \n" +
                "-Volkswagen \n" +
                "-Hyundai \n" +
                "-Chevrolet \n" +
                "-Peugeot \n" +
                "-Fiat \n" +
                "-Suzuki \n" +
                "-Renault \n" +
                "-Chery");

        System.out.println("Ingrese la marca de vehiculo deseada: ");

        userIn4 = scan.nextLine();

        if (userIn4.equalsIgnoreCase("Kia") || userIn4.equalsIgnoreCase("Citroen")
                || userIn4.equalsIgnoreCase("Volkswagen") || userIn4.equalsIgnoreCase("Hyundai")
                || userIn4.equalsIgnoreCase("Chevrolet") || userIn4.equalsIgnoreCase("Peugeot")
                || userIn4.equalsIgnoreCase("Fiat") || userIn4.equalsIgnoreCase("Suzuki")
                || userIn4.equalsIgnoreCase("Renault") || userIn4.equalsIgnoreCase("Chery")) {
            marca = userIn4.substring(0, 1).toUpperCase() + userIn4.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los modelos brindados en la lista.");
        }

        System.out.println("Es velocidad crucero? ");
        userIn5 = scan.nextLine();
        //Condicional de velocidad crucero
        if (userIn5.equalsIgnoreCase("Si")) {
            velocidadCrucero = true;
        } else if (userIn5.equalsIgnoreCase("No")) {
            velocidadCrucero = false;
        } else {
            throw new NullPointerException("Solo se aceptan los valores 'Si' o 'No'");
        }

        Auto auto4 = new Auto(numeroSerie,marca,color,fabricacion,velocidadCrucero);

        autos.add(auto4);


        System.out.println("Ingrese los valores para auto numero 5: ");

        System.out.println("Ingresar numero de serie: ");

        userIn1 = scan.nextLine();

        if(userIn1.length() < 5){
            numeroSerie = Integer.parseInt(userIn1);
        } else {
            throw new NullPointerException("El numero de serie no puede exceder los 4 caratectes numericos.");
        }

        System.out.println("Ingresar año de fabricacion: ");

        userIn2 = scan.nextLine();

        //Condicional del año de fabricacion
        if(userIn2.matches("^[1]+[9]+[9]+[0-9]$") || userIn2.matches("^[2]+[0]+[0-2]+[0-9]$")
                && !userIn2.matches("^[2]+[0]+[2]+[2-9]$")){
            fabricacion = Integer.parseInt(userIn2);
        } else {
            throw new NullPointerException("El año de fabricacion debe ser entre 1990 y año actual.");
        }

        System.out.println("A continuacion se le brindara una lista de colores disponibles para su vehiculo: ");

        //Listado de colores disponibles
        System.out.println("-Rojo \n" +
                "-Azul \n" +
                "-Negro \n" +
                "-Blanco \n" +
                "-Plateado");

        System.out.println("Ingrese un color correspondiente a la lista anterior: ");

        userIn3 = scan.nextLine();

        if (userIn3.equalsIgnoreCase("Rojo") || userIn3.equalsIgnoreCase("Azul")
                || userIn3.equalsIgnoreCase("Negro") || userIn3.equalsIgnoreCase("Blanco")
                || userIn3.equalsIgnoreCase("Plateado")) {
            color = userIn3.substring(0, 1).toUpperCase() + userIn3.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los colores brindados en la lista.");
        }

        System.out.println("A continuacion se le brindara una lista de modelos vehiculo disponibles: ");
        //Lista de autos disponibles
        System.out.println("-Kia \n" +
                "-Citroen \n" +
                "-Volkswagen \n" +
                "-Hyundai \n" +
                "-Chevrolet \n" +
                "-Peugeot \n" +
                "-Fiat \n" +
                "-Suzuki \n" +
                "-Renault \n" +
                "-Chery");

        System.out.println("Ingrese la marca de vehiculo deseada: ");

        userIn4 = scan.nextLine();

        if (userIn4.equalsIgnoreCase("Kia") || userIn4.equalsIgnoreCase("Citroen")
                || userIn4.equalsIgnoreCase("Volkswagen") || userIn4.equalsIgnoreCase("Hyundai")
                || userIn4.equalsIgnoreCase("Chevrolet") || userIn4.equalsIgnoreCase("Peugeot")
                || userIn4.equalsIgnoreCase("Fiat") || userIn4.equalsIgnoreCase("Suzuki")
                || userIn4.equalsIgnoreCase("Renault") || userIn4.equalsIgnoreCase("Chery")) {
            marca = userIn4.substring(0, 1).toUpperCase() + userIn4.substring(1);
        } else {
            throw new NullPointerException("Solo se aceptan los modelos brindados en la lista.");
        }

        System.out.println("Es velocidad crucero? ");
        userIn5 = scan.nextLine();

        if (userIn5.equalsIgnoreCase("Si")) {
            velocidadCrucero = true;
        } else if (userIn5.equalsIgnoreCase("No")) {
            velocidadCrucero = false;
        } else {
            throw new NullPointerException("Solo se aceptan los valores 'Si' o 'No'");
        }

        Auto auto5 = new Auto(numeroSerie,marca,color,fabricacion,velocidadCrucero);

        autos.add(auto5);

    return autos;
   }

     /** Imprimir Lista de Autos
      @author Ignacio Alvarez- Walter Rendo
      @param listaAutos
      * @see  #creacionAutos()
      */
   public static void imprimirAutos(ArrayList<Auto> listaAutos) {

       int counter = 1;

       for(int i= 0; i < listaAutos.size();i++) {

           String crucero = "";

           if (listaAutos.get(i).getVelocidadCrucero()){
               crucero = "Si";
           } else {
               crucero = "No";           }

           System.out.println("Datos de Auto #" + counter + "\n" +
                   "Numero de serie: " + listaAutos.get(i).getNumeroSerie() + "\n" +
                   "Año de fabricacion: " + listaAutos.get(i).getFabricacion() + "\n" +
                   "Color de vehiculo: " + listaAutos.get(i).getColor() + "\n" +
                   "Marca de vehiculo: " + listaAutos.get(i).getMarca() + "\n" +
                   "Velocidad crucero?: " + crucero + "\n");
           counter++;
       }
   }

     /** Imprimir Precio de Autos
      @author Ignacio Alvarez- Walter Rendo
      @param listaAutos 
      * @see #creacionAutos()
      */
   public static void precioAutos(ArrayList<Auto> listaAutos) {

       int counter = 1;
       double precioTotal = 0 ;

       for(int i=0; i < listaAutos.size();i++) {
           System.out.println("Precio de Auto #" + counter + ": " + listaAutos.get(i).precioAuto() + " USD");
           precioTotal = precioTotal + listaAutos.get(i).precioAuto();
           counter++;
       }
       System.out.println("Precio Total: " + precioTotal + " USD");
   }




    public static void main(String[] args) {
       ArrayList<Auto> listaAutos = new ArrayList<Auto>(Ejercicio.creacionAutos());
       Ejercicio.imprimirAutos(listaAutos);
       Ejercicio.precioAutos(listaAutos);
    }
}
