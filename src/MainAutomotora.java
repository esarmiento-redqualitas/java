
import java.util.Scanner;

public class MainAutomotora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * exepcion para casos de ingresas valores incorreto
         */
        try {
            /**
             * almesenamiento de datos a ingresarse
             */
            Auto auto1;
            Auto auto2;
            Auto auto3;
            Auto auto4;
            Auto auto5;
            /**
             * se solicita informacion por consolo para auto 1
             */
            System.out.println("Entre la información de auto 1");
            System.out.println("Entre el numero de serie del auto # 1");
            int numeroDeSerieauto1 = scanner.nextInt();
            System.out.println("Entre marca del auto # 1");
            String marcaAuto1 = scanner.next();
            System.out.println("Entre el color del auto # 1");
            String colorAuto1 = scanner.next();
            System.out.println("Entre el año de fabricacion del auto # 1");
            int fabricacionAuto1 = scanner.nextInt();
            System.out.println("Entre si tiene  velocidad crucero del auto # 1");
            boolean velocidadCruceroAuto1 = scanner.nextBoolean();

            /**
             * valores que comprente  auto1
             */
            auto1 = new Auto(numeroDeSerieauto1, marcaAuto1, colorAuto1, fabricacionAuto1, velocidadCruceroAuto1);

            System.out.println("**************************************************************************");

            /**
             * se solicita informacion por consolo para auto 2
             */
            System.out.println("Entre la información de auto 2");
            System.out.println("Entre el numero de serie del auto # 2");
            int numeroDeSerieauto2 = scanner.nextInt();
            System.out.println("Entre marca del auto # 2");
            String marcaAuto2 = scanner.next();
            System.out.println("Entre el color del auto # 2");
            String colorAuto2 = scanner.next();
            System.out.println("Entre el año de fabricacion del auto # 2");
            int fabricacionAuto2 = scanner.nextInt();
            System.out.println("Entre si tiene  velocidad crucero del auto # 2");
            boolean velocidadCruceroAuto2 = scanner.nextBoolean();

            /**
             * valores que comprente  auto2
             */
            auto2 = new Auto(numeroDeSerieauto2, marcaAuto2, colorAuto2, fabricacionAuto2, velocidadCruceroAuto2);

            System.out.println("**************************************************************************");

            /**
             * se solicita informacion por consolo para auto 3
             */
            System.out.println("Entre la información de auto 3");
            System.out.println("Entre el numero de serie del auto # 3");
            int numeroDeSerieauto3 = scanner.nextInt();
            System.out.println("Entre marca del auto # 3");
            String marcaAuto3 = scanner.next();
            System.out.println("Entre el color del auto # 3");
            String colorAuto3 = scanner.next();
            System.out.println("Entre el año de fabricacion del auto # 3");
            int fabricacionAuto3 = scanner.nextInt();
            System.out.println("Entre si tiene  velocidad crucero del auto # 3");
            boolean velocidadCruceroAuto3 = scanner.nextBoolean();

            /**
             * valores que comprente  auto3
             */
            auto3 = new Auto(numeroDeSerieauto3, marcaAuto3, colorAuto3, fabricacionAuto3, velocidadCruceroAuto3);

            System.out.println("**************************************************************************");

            /**
             * se solicita informacion por consolo para auto 4
             */
            System.out.println("Entre la información de auto 4");
            System.out.println("Entre el numero de serie del auto # 4");
            int numeroDeSerieauto4 = scanner.nextInt();
            System.out.println("Entre marca del auto # 4");
            String marcaAuto4 = scanner.next();
            System.out.println("Entre el color del auto # 4");
            String colorAuto4 = scanner.next();
            System.out.println("Entre el año de fabricacion del auto # 4");
            int fabricacionAuto4 = scanner.nextInt();
            System.out.println("Entre si tiene  velocidad crucero del auto # 4");
            boolean velocidadCruceroAuto4 = scanner.nextBoolean();

            /**
             * valores que comprente  auto4
             */
            auto4 = new Auto(numeroDeSerieauto4, marcaAuto4, colorAuto4, fabricacionAuto4, velocidadCruceroAuto4);

            System.out.println("**************************************************************************");

            /**
             * se solicita informacion por consolo para auto 5
             */
            System.out.println("Entre la información de auto 5");
            System.out.println("Entre el numero de serie del auto # 5");
            int numeroDeSerieauto5 = scanner.nextInt();
            System.out.println("Entre marca del auto # 5");
            String marcaAuto5 = scanner.next();
            System.out.println("Entre el color del auto # 5");
            String colorAuto5 = scanner.next();
            System.out.println("Entre el año de fabricacion del auto # 5");
            int fabricacionAuto5 = scanner.nextInt();
            System.out.println("Entre si tiene  velocidad crucero del auto # 5");
            boolean velocidadCruceroAuto5 = scanner.nextBoolean();

            /**
             * valores que comprente  auto5
             */
            auto5 = new Auto(numeroDeSerieauto5, marcaAuto5, colorAuto5, fabricacionAuto5, velocidadCruceroAuto5);

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            /**
             * array de 5 autos para imprimir por consola todos los datos decada uno de los autos y calculo de precion final
             */
            Auto[] autos = new Auto[]{auto1, auto2, auto3, auto4, auto5};

            System.out.println("Detalles de los autos que exsten en la automotora");
            for (int i = 0; i < autos.length; i++) {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("informacion auto # " + i + 1);
                System.out.println("Numero de serie:                                " + autos[i].getNumeroDeSerie());
                System.out.println("Marca:                                          " + autos[i].getMarca());
                System.out.println("Color:                                          " + autos[i].getColor());
                System.out.println("Año de Fabricacion:                             " + autos[i].getFabricacion());
                System.out.println("Tiene o no velocidad crucero:                   " + autos[i].getvelocidadCrucero());

                System.out.println("Precio final del Auto: " + autos[i].calcularPrecio());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


            }
            double montoFinal = auto1.calcularPrecio()+ auto2.calcularPrecio()+auto3.calcularPrecio()+auto4.calcularPrecio()+auto5.calcularPrecio();
            System.out.println("valor total" + montoFinal);

        } catch (Exception exception){
            System.out.println("Debe entrar valores numéricos enteros");
        }
        finally {
            System.out.println("El programa terminó");
        }
    }
}
