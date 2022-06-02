
package P1_Variables;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //        var usuario = "Jorge";
//        var titulo = "Ingeniero";
//        var union = titulo + " " + usuario;
//        System.out.println("Union = " + union);
//--------------------------------------------------------------
//        var i = 3;
//        var j = 4;
//        System.out.println(i + j + usuario + i + j);
//        System.out.println(usuario+(i+j));
//--------------------------------------------------------------
//        var nombre = "Jorge";
//        System.out.println("Nueva linea: \n" + nombre);
//        System.out.println("Tabulador: \t" + nombre);
//        System.out.println("Retroceso: \b\b" + nombre);
//        System.out.println("Comillas simple: \'" + nombre + "'");
//        System.out.println("Comillas doble: \"" + nombre + "\"");
//--------------------------------------------------------------
        //Scanner
//        Scanner consola = new Scanner(System.in);
//
//        System.out.print("Usename: ");
//        var usuario = consola.nextLine();
//
//        System.out.print("Titulo: ");
//        var titulo = consola.nextLine();
//
//        System.out.println(titulo + " " + usuario);
//--------------------------------------------------------------
        //Tarea2
        Scanner terminal = new Scanner(System.in);

        System.out.print("Proporciona el titulo: ");
        var titulo = terminal.nextLine();

        System.out.print("Proporciona el autor: ");
        var autor = terminal.nextLine();

        System.out.println("\n"+titulo + " fue escrito por " + autor);
//--------------------------------------------------------------
    }
    
}
