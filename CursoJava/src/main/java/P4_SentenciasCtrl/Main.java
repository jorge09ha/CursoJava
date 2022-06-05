package P4_SentenciasCtrl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//--------------------------------------------------------------
//        var condicion = true;
//
//        if (condicion) {  //Puede ser tambien condicion==true
//            System.out.println("Verdadero");
//        } else {
//            System.out.println("Falso");
//        } //si es solo una linea de codigo se puede utilizar sin llaves
//--------------------------------------------------------------
//        var num = 6;
//        var numeroTexto = "Numero desconocido";
//
//        if (num == 1) {
//            numeroTexto = "Numero 1";
//        } else if (num == 2) {
//            numeroTexto = "Numero 2";
//        } else if (num == 3) {
//            numeroTexto = "Numero 3";
//        } else if (num == 4) {
//            numeroTexto = "Numero 4";
//        } else {
//            numeroTexto = "Numero No encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//--------------------------------------------------------------
//        Scanner terminal = new Scanner(System.in);
//
//        System.out.print("Engrece el num del mes: ");
//        int numMes = terminal.nextInt();
//        String estacion = "Desconocida";
//
//        if (numMes == 1 || numMes == 2 || numMes == 12) {
//            estacion = "Invierno";
//        } else if (numMes == 3 || numMes == 4 || numMes == 5) {
//            estacion = "Primavera";
//        } else if (numMes == 6 || numMes == 7 || numMes == 8) {
//            estacion = "Verano";
//        } else if (numMes == 9 || numMes == 10 || numMes == 11) {
//            estacion = "Otoño";
//        }
//        System.out.println("estacion = " + estacion);
//--------------------------------------------------------------
//        var num = 5;
//        var numTex = "Desconocido";
//        switch (num) {
//            case 1:
//                numTex = "uno";
//                break;
//            case 2:
//                numTex = "dos";
//                break;
//            case 3:
//                numTex = "tres";
//                break;
//            case 4:
//                numTex = "cuatro";
//                break;
//            default:
//                numTex = "Caso no encontrado";
//        }
////        numTex = switch (num) {
////            case 1 ->
////                "uno";
////            case 2 ->
////                "dos";
////            case 3 ->
////                "tres";
////            case 4 ->
////                "cuatro";
////            default ->
////                "Caso no encontrado";
////        };
//        System.out.println("numTex = " + numTex);
//--------------------------------------------------------------
//        Scanner terminal = new Scanner(System.in);
//        System.out.print("Engrece el num del mes: ");
//        int mes = terminal.nextInt();
//
//        var estacion = "Desconocida";
//
//        switch (mes) {
//            case 1, 2, 12 ->
//                estacion = "Invierno";
//            case 3, 4, 5 ->
//                estacion = "Primavera";
//            case 6, 7, 8 ->
//                estacion = "Verano";
//            case 9, 10, 11 ->
//                estacion = "Otonio";
//        }
//        System.out.println("estacion = " + estacion);
//--------------------------------------------------------------
        //Tarea1
        Scanner terminal = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 10: ");
        var num = terminal.nextDouble();
        var nota = "Desconocido";

        if (num >= 9 && num < 10) {
            nota = "A";
        } else if (num >= 8 && num < 9) {
            nota = "B";
        } else if (num >= 7 && num < 8) {
            nota = "C";
        } else if (num >= 6 && num < 7) {
            nota = "D";
        } else if (num >= 0 && num < 6) {
            nota = "F";
        } else {
            nota = "Valor ingresado fuera de rango";
        }

        System.out.println("nota = " + nota);
//--------------------------------------------------------------
        //Tarea2
        
//--------------------------------------------------------------
    }
}
