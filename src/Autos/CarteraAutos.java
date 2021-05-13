package Autos;

import java.util.Scanner;

public class CarteraAutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {



        Auto Auto1;
        Auto Auto2;
        Auto Auto3;
        Auto Auto4;
        Auto Auto5;


        System.out.println("Ingrese los datos de los autos: ");

        System.out.println("Ingrese un Numero de Serie # 1");
        int numSerieAuto1 = scanner.nextInt();
        System.out.println("Ingrese la Marca del auto # 1");
        String marcaAuto1 = scanner.next();
        while (!marcaAuto1.equals("Kia") && !marcaAuto1.equals("Citroen") && !marcaAuto1.equals("Volskwagen") && !marcaAuto1.equals("Hyundai") && !marcaAuto1.equals("Peugeot")
                &&!marcaAuto1.equals("Fiat") &&!marcaAuto1.equals("Susuky") && !marcaAuto1.equals("Chevrolet") && !marcaAuto1.equals("Renault") && !marcaAuto1.equals("Chery")){
            System.out.println("Entro una marca incorrecta, vuelva a entrar la marca");
            marcaAuto1 = scanner.next();
        }
        System.out.println("Ingrese el Color de auto # 1");
        String colorAuto1 = scanner.next();
        System.out.println("Ingrese el Año(formato ej. 2021) de fabricacion del auto # 1");
        int fechaFabricacionauto1 = scanner.nextInt();
        System.out.println("Ingrese True si el auto tiene velocidad crucero o False si no la tiene # 1");
        boolean veloCruceroAuto1 = scanner.nextBoolean();
        Auto1 = new Auto(numSerieAuto1, marcaAuto1, colorAuto1, fechaFabricacionauto1, veloCruceroAuto1);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Ingrese un Numero de Serie # 2");
        int numSerieAuto2 = scanner.nextInt();
        System.out.println("Ingrese la Marca del auto # 2");
            String marcaAuto2 = scanner.next();
        while (!marcaAuto2.equals("Kia") && !marcaAuto2.equals("Citroen") && !marcaAuto2.equals("Volskwagen") && !marcaAuto2.equals("Hyundai") && !marcaAuto2.equals("Peugeot")
               &&!marcaAuto2.equals("Fiat") &&!marcaAuto2.equals("Susuky") && !marcaAuto2.equals("Chevrolet") && !marcaAuto2.equals("Renault") && !marcaAuto2.equals("Chery")){
                System.out.println("Entro una Marca incorrecta, vuelva a entrar la Marca");
             marcaAuto2 = scanner.next();
            }
        System.out.println("Ingrese el Color del auto # 2");
        String colorAuto2 = scanner.next();
        System.out.println("Ingrese el Año(formato ej. 2021) de fabricacion del auto # 2");
        int fechaFabricacionauto2 = scanner.nextInt();
        System.out.println("Ingrese True si el auto tiene velocidad crucero o False si no la tiene  # 2");
        boolean veloCruceroAuto2 = scanner.nextBoolean();
        Auto2 = new Auto(numSerieAuto2, marcaAuto2, colorAuto2, fechaFabricacionauto2, veloCruceroAuto2);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Ingrese un Numero de Serie # 3");
        int numSerieAuto3 = scanner.nextInt();
        System.out.println("Ingrese la Marca del auto # 3");
        String marcaAuto3 = scanner.next();
        while (!marcaAuto3.equals("Kia") && !marcaAuto3.equals("Citroen") && !marcaAuto3.equals("Volskwagen") && !marcaAuto3.equals("Hyundai") && !marcaAuto3.equals("Peugeot")
               &&!marcaAuto3.equals("Fiat") &&!marcaAuto3.equals("Susuky") && !marcaAuto3.equals("Chevrolet") && !marcaAuto3.equals("Renault") && !marcaAuto3.equals("Chery")){
        System.out.println("Entro una Marca incorrecta, vuelva a entrar la Marca");
              marcaAuto3 = scanner.next();
            }
        System.out.println("Ingrese el Color del auto # 3");
        String colorAuto3 = scanner.next();
        System.out.println("Ingrese el Año(formato ej. 2021) de fabricacion del auto # 3");
        int fechaFabricacionauto3 = scanner.nextInt();
        System.out.println("Ingrese True si el auto tiene velocidad crucero o False si no la tiene  # 3");
        boolean veloCruceroAuto3 = scanner.nextBoolean();
        Auto3 = new Auto(numSerieAuto3, marcaAuto3, colorAuto3, fechaFabricacionauto3, veloCruceroAuto3);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Ingrese un Numero de Serie # 4");
        int numSerieAuto4 = scanner.nextInt();
        System.out.println("Ingrese la Marca del auto # 4");
        String marcaAuto4 = scanner.next();
        while (!marcaAuto4.equals("Kia") && !marcaAuto4.equals("Citroen") && !marcaAuto4.equals("Volskwagen") && !marcaAuto4.equals("Hyundai") && !marcaAuto4.equals("Peugeot")
                &&!marcaAuto4.equals("Fiat") &&!marcaAuto4.equals("Susuky") && !marcaAuto4.equals("Chevrolet") && !marcaAuto4.equals("Renault") && !marcaAuto4.equals("Chery")){
                System.out.println("Entro una Marca incorrecta, vuelva a entrar la Marca");
                marcaAuto4 = scanner.next();
            }
        System.out.println("Ingrese el Color de auto # 4");
        String colorAuto4 = scanner.next();
        System.out.println("Ingrese el Año(formato ej. 2021) de fabricacion del auto # 4");
        int fechaFabricacionauto4 = scanner.nextInt();
        System.out.println("Ingrese True si el auto tiene velocidad crucero o False si no la tiene  # 4");
        boolean veloCruceroAuto4 = scanner.nextBoolean();
        Auto4 = new Auto(numSerieAuto4, marcaAuto4, colorAuto4, fechaFabricacionauto4, veloCruceroAuto4);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Ingrese un Numero de Serie # 5");
        int numSerieAuto5 = scanner.nextInt();
        System.out.println("Ingrese la Marca del auto # 5");
        String marcaAuto5 = scanner.next();
        while (!marcaAuto5.equals("Kia") && !marcaAuto5.equals("Citroen") && !marcaAuto5.equals("Volskwagen") && !marcaAuto5.equals("Hyundai") && !marcaAuto5.equals("Peugeot")
                &&!marcaAuto5.equals("Fiat") &&!marcaAuto5.equals("Susuky") && !marcaAuto5.equals("Chevrolet") && !marcaAuto5.equals("Renault") && !marcaAuto5.equals("Chery")){
                System.out.println("Entro una Marca incorrecta, vuelva a entrar la Marca");
                marcaAuto5 = scanner.next();
            }
        System.out.println("Ingrese el Color de auto # 5");
        String colorAuto5 = scanner.next();
        System.out.println("Ingrese el Año(formato ej. 2021) de fabricacion del auto # 5");
        int fechaFabricacionauto5 = scanner.nextInt();
        System.out.println("Ingrese True si el auto tiene velocidad crucero o False si no la tiene  # 5");
        boolean veloCruceroAuto5 = scanner.nextBoolean();
        Auto5 = new Auto(numSerieAuto5, marcaAuto5, colorAuto5, fechaFabricacionauto5, veloCruceroAuto5);

        System.out.println("-----------------------------------------------------------------------------------------");
        Auto[] autos = new Auto[]{Auto1, Auto2, Auto3, Auto4, Auto5};

        System.out.println("Los Vehiculos ingresados son: ");
        for (int i = 0; i < autos.length; i++) {
            System.out.println("Datos del vehículo # " +(i+1));
            System.out.println("NumeroSerie: " + autos[i].getNumSerie());
            System.out.println("Marca : " + autos[i].getMarca());
            System.out.println("Color:" + autos[i].getColor());
            System.out.println("Fecha de Fabricacion:" + autos[i].getFabricacion());
            System.out.println("Velocidad Crucero: " + autos[i].veloCrucero());
            System.out.println("Precio final del auto: " + autos[i].calcularPrecio());
            System.out.println("********************");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("El valor de los autos ingresados es: ");
        System.out.println(Auto1.calcularPrecio() + Auto2.calcularPrecio() + Auto3.calcularPrecio() + Auto4.calcularPrecio() + Auto5.calcularPrecio());
        System.out.println("-----------------------------------------------------------------------------------------");
        }catch (Exception e) {
            System.out.println("Ingreso un dato incorrecto, lea atentamente lo que se solicita ingresar");         }
    }



}



