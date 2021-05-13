import java.util.Scanner;

public class Automotora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Autos Auto1;
        Autos Auto2;
        Autos Auto3;
        Autos Auto4;
        Autos Auto5;

        /**
         * @exception captura un dato mal suministrado por el usuario y finaliza el programa
         */
        try{
        System.out.println("-----------------------------");
        System.out.println("Datos del auto #1");
        System.out.println("Ingrese número de serie:");
        int serie1 = teclado.nextInt();
        System.out.println("Indique marca del vehículo:");
        String marca1 = teclado.next();

        while (!marca1.equals("Kia") && !marca1.equals("Citroen") && !marca1.equals("Volkswagen") && !marca1.equals("Hyundai") && !marca1.equals("Peugeot")
                && !marca1.equals("Fiat") && !marca1.equals("Suzuki") && !marca1.equals("Chevrolet") && !marca1.equals("Renault") && !marca1.equals("Chery")) {
            System.out.println("Entro una marca de auto incorrecta: Vuelva a entrar la marca del auto");
            marca1 = teclado.next();
        }

        System.out.println("Color del vehículo:");
        String color1 = teclado.next();
        System.out.println("Año de fabricación:");
        int fabricacion1 = teclado.nextInt();
        System.out.println("¿Cuenta con velocidad crucero?, responda 'true' o 'false'");
        boolean velCrucero1 = teclado.nextBoolean();

        Auto1 = new Autos(serie1, marca1, color1, fabricacion1, velCrucero1);

        System.out.println("-----------------------------");
        System.out.println("Datos del auto #2");
        System.out.println("Ingrese número de serie:");
        int serie2 = teclado.nextInt();
        System.out.println("Indique marca del vehículo:");
        String marca2 = teclado.next();
        while (!marca2.equals("Kia") && !marca2.equals("Citroen") && !marca2.equals("Volkswagen") && !marca2.equals("Hyundai") && !marca2.equals("Peugeot")
                && !marca2.equals("Fiat") && !marca2.equals("Suzuki") && !marca2.equals("Chevrolet") && !marca2.equals("Renault") && !marca2.equals("Chery")) {
            System.out.println("Entro una marca de auto incorrecta: Vuelva a entrar la marca del auto");
            marca2 = teclado.next();
        }
        System.out.println("Color del vehículo:");
        String color2 = teclado.next();
        System.out.println("Año de fabricación:");
        int fabricacion2 = teclado.nextInt();
        System.out.println("¿Cuenta con velocidad crucero?, responda 'true' o 'false'");
        boolean velCrucero2 = teclado.nextBoolean();

        Auto2 = new Autos(serie2, marca2, color2, fabricacion2, velCrucero2);

        System.out.println("-----------------------------");
        System.out.println("Datos del auto #3");
        System.out.println("Ingrese número de serie:");
        int serie3 = teclado.nextInt();
        System.out.println("Indique marca del vehículo:");
        String marca3 = teclado.next();
        while (!marca3.equals("Kia") && !marca3.equals("Citroen") && !marca3.equals("Volkswagen") && !marca3.equals("Hyundai") && !marca3.equals("Peugeot")
                && !marca3.equals("Fiat") && !marca3.equals("Suzuki") && !marca3.equals("Chevrolet") && !marca3.equals("Renault") && !marca3.equals("Chery")) {
            System.out.println("Entro una marca de auto incorrecta: Vuelva a entrar la marca del auto");
            marca3 = teclado.next();
        }
        System.out.println("Color del vehículo:");
        String color3 = teclado.next();
        System.out.println("Año de fabricación:");
        int fabricacion3 = teclado.nextInt();
        System.out.println("¿Cuenta con velocidad crucero?, responda 'true' o 'false'");
        boolean velCrucero3 = teclado.nextBoolean();

        Auto3 = new Autos(serie3, marca3, color3, fabricacion3, velCrucero3);

        System.out.println("-----------------------------");
        System.out.println("Datos del auto #4");
        System.out.println("Ingrese número de serie:");
        int serie4 = teclado.nextInt();
        System.out.println("Indique marca del vehículo:");
        String marca4 = teclado.next();
        while (!marca4.equals("Kia") && !marca4.equals("Citroen") && !marca4.equals("Volkswagen") && !marca4.equals("Hyundai") && !marca4.equals("Peugeot")
                && !marca4.equals("Fiat") && !marca4.equals("Suzuki") && !marca4.equals("Chevrolet") && !marca4.equals("Renault") && !marca4.equals("Chery")) {
            System.out.println("Entro una marca de auto incorrecta: Vuelva a entrar la marca del auto");
            marca4 = teclado.next();
        }
        System.out.println("Color del vehículo:");
        String color4 = teclado.next();
        System.out.println("Año de fabricación:");
        int fabricacion4 = teclado.nextInt();
        System.out.println("¿Cuenta con velocidad crucero?, responda 'true' o 'false'");
        boolean velCrucero4 = teclado.nextBoolean();

        Auto4 = new Autos(serie4, marca4, color4, fabricacion4, velCrucero4);

        System.out.println("-----------------------------");
        System.out.println("Datos del auto #5");
        System.out.println("Ingrese número de serie:");
        int serie5 = teclado.nextInt();
        System.out.println("Indique marca del vehículo:");
        String marca5 = teclado.next();
        while (!marca5.equals("Kia") && !marca5.equals("Citroen") && !marca5.equals("Volkswagen") && !marca5.equals("Hyundai") && !marca5.equals("Peugeot")
                && !marca5.equals("Fiat") && !marca5.equals("Suzuki") && !marca5.equals("Chevrolet") && !marca5.equals("Renault") && !marca5.equals("Chery")) {
            System.out.println("Entro una marca de auto incorrecta: Vuelva a entrar la marca del auto");
            marca5 = teclado.next();
        }
        System.out.println("Color del vehículo:");
        String color5 = teclado.next();
        System.out.println("Año de fabricación:");
        int fabricacion5 = teclado.nextInt();
        System.out.println("¿Cuenta con velocidad crucero?, responda 'true' o 'false'");
        boolean velCrucero5 = teclado.nextBoolean();

        Auto5 = new Autos(serie5, marca5, color5, fabricacion5, velCrucero5);

        Autos[] arregloAutos = new Autos[5];

        arregloAutos[0] = Auto1;
        arregloAutos[1] = Auto2;
        arregloAutos[2] = Auto3;
        arregloAutos[3] = Auto4;
        arregloAutos[4] = Auto5;

        for (int i = 0; i < arregloAutos.length; i++) {
            System.out.println("****DATOS DE LOS VEHICULOS****");
            System.out.println("Auto #" + (i + 1));
            System.out.println("Marca: " + arregloAutos[i].getMarca());
            System.out.println("Color: " + arregloAutos[i].getColor());
            System.out.println("Año: " + arregloAutos[i].getFabricacion());
            System.out.println("N° de serie: " + arregloAutos[i].getSerie());
            System.out.println("Precio en usd:" + arregloAutos[i].precioFinal());
            if (arregloAutos[i].getVelCrucero()) {
                System.out.println("Este vehículo cuenta con velocidad crucero");
            } else {
                System.out.println("Este vehículo no cuenta con velocidad crucero");
            }

        }
            /**
             * valorStock calcula la suma total de estos 5 autos en la automotora
             */
        double valorStock = Auto1.precioFinal() + Auto2.precioFinal() + Auto3.precioFinal() + Auto4.precioFinal() + Auto5.precioFinal();
        System.out.println("El valor total de los vehículos en stock es de " + valorStock + " usd");} catch (Exception er){
            System.out.println("Ingresó un dato incorrecto y el programa finalizó, ejecute todo nuevamente");
        }
    }
}
