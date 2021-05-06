
package Autos;
/**
 * @author Marcelo Gesto Juan gomez
 * Clase Main con documentacion
 */
import java.util.Scanner;

/**
 *
 */
public class Main {
    /**
     *
     * @param args ejecutar por consola
     */
    public static void main(String[] args) {
        /**@scanner
         * funcion para ingreso de datos por parte del usuario
         */
        Scanner scanner = new Scanner(System.in);
/** Declaración de las variables
 */
        Auto auto1;
        Auto auto2;
        Auto auto3;
        Auto auto4;
        Auto auto5;

/** @System.out.println Muestra mensaje por pantalla
 * @scanner.next() Toma los datos ingresados por el usuario
 */
        System.out.println("Ingrese la información de los vehículos");
/** @try con esta funcion garantizamos un funcionamiento correcto en caso de que ingrese el usuario un dato que no corresponda devuelve una excepcion
*/
        try {
            System.out.println("Ingrese el número de serie del primer vehículo");
            int numeroSerieAuto1 = scanner.nextInt();

            System.out.println("Ingrese la marca del primer vehículo" + "(Kia Citroen Volkswagen Hyundai Peugeot Fiat Suzuki Chevrolet Renault Chery)");
            String marcaAuto1 = scanner.next();
/** @while Genera la condición para que se usen solo el grupo de marcas indicado en caso contrario vuelve se sigue ejecutando hasta que se ingrese una de las marcas
 *
 */

            while (!marcaAuto1.equals("Kia") && !marcaAuto1.equals("Citroen") && !marcaAuto1.equals("Volkswagen") && !marcaAuto1.equals("Hyundai") && !marcaAuto1.equals("Peugeot")
                    && !marcaAuto1.equals("Fiat") && !marcaAuto1.equals("Suzuki") && !marcaAuto1.equals("Chevrolet") && !marcaAuto1.equals("Renault") && !marcaAuto1.equals("Chery")) {
                System.out.println("Debe escribir una marca de las permitidas");
                marcaAuto1 = scanner.next();
            }
            System.out.println("Ingrese el color del primer vehículo");
            String colorAuto1 = scanner.next();
            System.out.println("Ingrese la fecha de fabricación del primer vehículo");
            int fabricacionAuto1 = scanner.nextInt();
            System.out.println("Ingrese si el vehículo posee velocidad de crucero (true o false)");
            boolean velocidadCruceroAuto1 = scanner.nextBoolean();


            auto1 = new Auto(numeroSerieAuto1, marcaAuto1, colorAuto1, fabricacionAuto1, velocidadCruceroAuto1);


            System.out.println("**************************************************************************");


            System.out.println("Ingrese la información de los vehículos");
            System.out.println("Ingrese el número de serie del segundo vehículo");
            int numeroSerieAuto2 = scanner.nextInt();
            System.out.println("Ingrese la marca del segundo vehículo" + "(Kia Citroen Volkswagen Hyundai Peugeot Fiat Suzuki Chevrolet Renault Chery)");
            String marcaAuto2 = scanner.next();
            while (!marcaAuto2.equals("Kia") && !marcaAuto2.equals("Citroen") && !marcaAuto2.equals("Volkswagen") && !marcaAuto2.equals("Hyundai") && !marcaAuto2.equals("Peugeot")
                    && !marcaAuto2.equals("Fiat") && !marcaAuto2.equals("Suzuki") && !marcaAuto2.equals("Chevrolet") && !marcaAuto2.equals("Renault") && !marcaAuto2.equals("Chery")) {
                System.out.println("Debe escribir una marca de las permitidas");
                marcaAuto2 = scanner.next();
            }
            System.out.println("Ingrese el color del segundo vehículo");
            String colorAuto2 = scanner.next();
            System.out.println("Ingrese la fecha de fabricación del segundo vehículo");
            int fabricacionAuto2 = scanner.nextInt();
            System.out.println("Ingrese si el vehículo posee velocidad de crucero (true o false)");
            boolean velocidadCruceroAuto2 = scanner.nextBoolean();

            auto2 = new Auto(numeroSerieAuto2, marcaAuto2, colorAuto2, fabricacionAuto2, velocidadCruceroAuto2);

            System.out.println("**************************************************************************");

            System.out.println("Ingrese la información de los vehículos");
            System.out.println("Ingrese el número de serie del tercer vehículo");
            int numeroSerieAuto3 = scanner.nextInt();
            System.out.println("Ingrese la marca del tercer vehículo" + "(Kia Citroen Volkswagen Hyundai Peugeot Fiat Suzuki Chevrolet Renault Chery)");
            String marcaAuto3 = scanner.next();
            while (!marcaAuto3.equals("Kia") && !marcaAuto3.equals("Citroen") && !marcaAuto3.equals("Volkswagen") && !marcaAuto3.equals("Hyundai") && !marcaAuto3.equals("Peugeot")
                    && !marcaAuto3.equals("Fiat") && !marcaAuto3.equals("Suzuki") && !marcaAuto3.equals("Chevrolet") && !marcaAuto3.equals("Renault") && !marcaAuto3.equals("Chery")) {
                System.out.println("Debe escribir una marca de las permitidas");
                marcaAuto3 = scanner.next();
            }
            System.out.println("Ingrese el color del tercer vehículo");
            String colorAuto3 = scanner.next();
            System.out.println("Ingrese la fecha de fabricación del tercer vehículo");
            int fabricacionAuto3 = scanner.nextInt();
            System.out.println("Ingrese si el vehículo posee velocidad de crucero (true o false)");
            boolean velocidadCruceroAuto3 = scanner.nextBoolean();

            auto3 = new Auto(numeroSerieAuto3, marcaAuto3, colorAuto3, fabricacionAuto3, velocidadCruceroAuto3);

            System.out.println("**************************************************************************");

            System.out.println("Ingrese la información de los vehículos");
            System.out.println("Ingrese el número de serie del cuarto vehículo");
            int numeroSerieAuto4 = scanner.nextInt();
            System.out.println("Ingrese la marca del cuarto vehículo" + "(Kia, Citroen, Volkswagen, Hyundai, Peugeot, Fiat, Suzuki, Chevrolet, Renault, Chery)");
            String marcaAuto4 = scanner.next();
            while (!marcaAuto4.equals("Kia") && !marcaAuto4.equals("Citroen") && !marcaAuto4.equals("Volkswagen") && !marcaAuto4.equals("Hyundai") && !marcaAuto4.equals("Peugeot")
                    && !marcaAuto4.equals("Fiat") && !marcaAuto4.equals("Suzuki") && !marcaAuto4.equals("Chevrolet") && !marcaAuto4.equals("Renault") && !marcaAuto4.equals("Chery")) {
                System.out.println("Debe escribir una marca de las permitidas");
                marcaAuto4 = scanner.next();
            }
            System.out.println("Ingrese el color del cuarto vehículo");
            String colorAuto4 = scanner.next();
            System.out.println("Ingrese la fecha de fabricación del cuarto vehículo");
            int fabricacionAuto4 = scanner.nextInt();
            System.out.println("Ingrese si el vehículo posee velocidad de crucero (true o false)");
            boolean velocidadCruceroAuto4 = scanner.nextBoolean();

            auto4 = new Auto(numeroSerieAuto4, marcaAuto4, colorAuto4, fabricacionAuto4, velocidadCruceroAuto4);

            System.out.println("**************************************************************************");

            System.out.println("Ingrese la información de los vehículos");
            System.out.println("Ingrese el número de serie del quinto vehículo");
            int numeroSerieAuto5 = scanner.nextInt();
            System.out.println("Ingrese la marca del quinto vehículo" + "(Kia Citroen Volkswagen Hyundai Peugeot Fiat Suzuki Chevrolet Renault Chery)");
            String marcaAuto5 = scanner.next();
            while (!marcaAuto5.equals("Kia") && !marcaAuto5.equals("Citroen") && !marcaAuto5.equals("Volkswagen") && !marcaAuto5.equals("Hyundai") && !marcaAuto5.equals("Peugeot")
                    && !marcaAuto5.equals("Fiat") && !marcaAuto5.equals("Suzuki") && !marcaAuto5.equals("Chevrolet") && !marcaAuto5.equals("Renault") && !marcaAuto5.equals("Chery")) {
                System.out.println("Debe escribir una marca de las permitidas");
                marcaAuto5 = scanner.next();
            }
            System.out.println("Ingrese el color del quinto vehículo");
            String colorAuto5 = scanner.next();
            System.out.println("Ingrese la fecha de fabricación del quinto vehículo");
            int fabricacionAuto5 = scanner.nextInt();
            System.out.println("Ingrese si el vehículo posee velocidad de crucero (true o false)");
            boolean velocidadCruceroAuto5 = scanner.nextBoolean();

            auto5 = new Auto(numeroSerieAuto5, marcaAuto5, colorAuto5, fabricacionAuto5, velocidadCruceroAuto5);

            System.out.println("**************************************************************************");
            Auto[] auto = new Auto[]{auto1, auto2, auto3, auto4, auto5};
/**
 * @for con esta funcion muestra el total de los datos ingresados
 */
            System.out.println("Detalles de los autos");
            for (int i = 0; i < auto.length; i++) {
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Datos del auto # " + i + 1);
                System.out.println("numero de serie " + auto[i].getNumeroSerie());
                System.out.println("Marca" + auto[i].getMarca());
                System.out.println("Color" + auto[i].getColor());
                System.out.println("Fabricacion" + auto[i].getFabricacion());
                System.out.println("Velocidad crucero" + auto[i].getvelocidadCrucero());
                System.out.println("Precio auto" + auto[i].calcularPrecio());
                System.out.println("---------------------------------------------------------------------------");
            }
/**
 * @for con esta funcion suma el total del precio de los autos
  */

            double precioTotalAutos = 0;
            for (int i = 0; i < auto.length; i++) {
                precioTotalAutos = precioTotalAutos + auto[i].calcularPrecio();
            }
            System.out.println("Precio Total: " + precioTotalAutos);
/**
 * @catch en caso de haber una excepcion muestra texto en pantalla
  */
        } catch (Exception exception) {
            System.out.println("Entro un tipo de dato no esperado por la aplicación");

        }


    }
}
