package P2_Primitivos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            Tipo Primitivos 

            Enteros: byte, short, int, char, long
            Flotantes: float, double
         */
//        byte numByte = 127;
//        System.out.println(numByte);
//        System.out.println("Valor minimo de Byte: " + Byte.MIN_VALUE);
//        System.out.println("Valor Maximo de Byte: " + Byte.MAX_VALUE);
//        numByte = (byte) 129;
//
//        System.out.println(numByte);
//        short numShort = 10;
//        System.out.println("numShort = " + numShort); //soutv
//        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
//        System.out.println("Valor Maximo de short: " + Short.MAX_VALUE);
//        numShort = (short) 32768;
//        System.out.println(numShort);
//
//        int numInt = 10;
//        System.out.println("numInt = " + numInt);
//        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
//        System.out.println("Valor Maximo de int: " + Integer.MAX_VALUE);
//        numInt = (int) 2147483648L;
//        System.out.println("numInt = " + numInt);
//
//        long numLong = 10;
//        System.out.println("numLong = " + numLong);
//        System.out.println("Valor minimo de Long: " + Long.MIN_VALUE);
//        System.out.println("Valor Maximo de Long: " + Long.MAX_VALUE);
//        numLong = (long) 9223372036854775807L; //D F
//        System.out.println(numLong);
//        float numFloat = (float) 10.0;
//        System.out.println(numFloat);
//        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
//        System.out.println("Valor Maximo de float: " + Float.MAX_VALUE);
//        numFloat = (float)3.4028236E38D;
//        System.out.println(numFloat);
//        
//        double numDouble = 10;
//        System.out.println(numDouble);
//        System.out.println("Valor minimo de float: " + Double.MIN_VALUE);
//        System.out.println("Valor Maximo de float: " + Double.MAX_VALUE);
//        numDouble = 1.7976931348623158E308;
//        System.out.println(numDouble);

//***************************************************
//        var numEntero = 10;
//        System.out.println(numEntero);
//        
//        var numDouble = 10.0;
//        System.out.println(numDouble);
//        
//        var numFloat = 10.0F;
//        System.out.println(numFloat);
//
//***************************************************
//
//        char miChart = 'a';
//        System.out.println("miChart = " + miChart);
//        
//        char varChart = '\u0021';
//        System.out.println("varChart = " + varChart);
//        
//        char varChartDecimal = 33;
//        System.out.println("varChartDecimal = " + varChartDecimal);
//        
//        char varChartSimbolo = '!';
//        System.out.println("varChartSimbolo = " + varChartSimbolo);
//
//***************************************************
//
//        var varChart1 = '\u0021';
//        System.out.println("varChart1 = " + varChart1);
//
//        var varChart2 = (char) 33;
//        System.out.println("varChart2 = " + varChart2);
//
//        var varChart3 = '!';
//        System.out.println("varChart3 = " + varChart3);
//
//        int varEnteraSimb = '!';
//        System.out.println("varEnteraSimb = " + varEnteraSimb);
//
//***************************************************
//
//        boolean varBoolean = false;
//        System.out.println("varBoolean = " + varBoolean);
//
//        if (varBoolean) {
//            System.out.println("Verdadero");
//        } else {
//            System.out.println("Falso");
//        }
//        
//        int edad = 20;
//        //var esAdulto = edad >= 18;
//        if (edad >= 18) {
//            System.out.println("Es mayor");
//        } else {
//            System.out.println("Es Menor");
//        }
//
//***************************************************
          //Convertir tipo string a int
//        var edadStr = "20";
//        var edadInt = Integer.parseInt(edadStr);
//        var edadDouble = Double.parseDouble(edadStr);
//
//        System.out.println(edadStr + 1);
//        System.out.println(edadInt + 1);
//        System.out.println(edadDouble);
//
//        //Pedir un valor
//        var terminal = new Scanner(System.in);
//        System.out.print("Ingrese la edad: ");
//        edadInt = Integer.parseInt(terminal.nextLine());
//        System.out.println(edadInt);
//
//        var edadTexto = String.valueOf(10);
//        //System.out.println(edadTexto);
//
//        var palabra = "Hola";
//        
//        //System.out.println(palabra.charAt(0));
//        
//        for (int i = 0; i < palabra.length(); i++) {
//            System.out.println(palabra.charAt(i));
//        }
//        
//        System.out.print("Cual es su nombre: ");
//        var caracter1 = terminal.nextLine().charAt(0);
//        System.out.println(caracter1);
//        var nombre = "Juan";
//        System.out.println(nombre);
//        nombre = "Carlos";
//        System.out.println(nombre);
//
//--------------------------------------------------------------
        //Tarea 3
        Scanner terminal = new Scanner(System.in);

        System.out.print("Proporciona el nombre: ");
        String nombre = terminal.nextLine();

        System.out.print("Proporciona el id: ");
        int id = terminal.nextInt();

        System.out.print("Proporciona el precio: ");
        double precio = terminal.nextDouble();

        System.out.print("Proporciona el envio gratuito: ");
        boolean enviogratuito = terminal.nextBoolean();

        System.out.println("\n" + nombre + " #" + id + "\nPrecio:  $" + precio + "\nEnvio Gratuito: " + enviogratuito);
    }

}
