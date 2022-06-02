package P3_Operadores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Operadores
//        int a = 3, b = 2;
//        var resultado = a + b;
//        System.out.println("resultado suma = " + resultado);
//
//        resultado = a - b;
//        System.out.println("resultado resta = " + resultado);
//
//        resultado = a * b;
//        System.out.println("resultado muntiplicacion = " + resultado);
//
//        var resultado2 = 3.0 / b;
//        System.out.println("resultado division = " + resultado2);
//
//        resultado = a % b;
//        System.out.println("resultado Residuo = " + resultado);
//
//        if (a % 2 == 0) {
//            System.out.println("Si es par");
//        } else {
//            System.out.println("No es par");
//        }
//--------------------------------------------------------------
        //Operadores de Asignación
//        int a = 3, b = 2;
//        int c = a + 5 - b;
//        System.out.println("c = " + c);
//        
//        a += 1; //a+1
//        System.out.println("a = " + a);  
//        
//        b -= 1; //b-1
//        System.out.println("b = " + b);
//--------------------------------------------------------------
        //Operadores Unarios
//        var a = 3;
//        var b = -a;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        var c = true;
//        var d = !c;
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//
        //Incremento
        //1.Preincremento (Simbolo antes de la variable)
//        var e = 3;
//        var f = ++e;
//        
//        System.out.println("e = " + e);
//        System.out.println("f = " + f);
//        
        //2.Postincremento (Despues de la variable)
//        var g = 5;
//        var h = g++; //primero se utiliza el valor y despues se incrementa
//        System.out.println("g = " + g);
//        System.out.println("h = " + h);
        //Decremento
        //1.Predecremento
//        var i =2;
//        var j = --i;
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
        //2.Postdecremento
//        var k =2;
//        var l = i--;
//        System.out.println("k = " + k);
//        System.out.println("l = " + l);
//--------------------------------------------------------------
        //Operadores de Igualdad y Relacionales
//        var a = 3;
//        var b = 2;
//
//        var c = (a == b);
//        System.out.println("c = " + c);
//
//        var d = a != b;
//        System.out.println("d = " + d);
//        
//        var cadena = "Hola";
//        var cadena2 = "Hola";
//        var e = cadena == cadena2; //se compara la referencia de los odjetos
//        System.out.println("e = " + e);
//        
//        var f = cadena.equals(cadena2); //esto si compara el contenido del str
//        System.out.println("f = " + f);
//--------------------------------------------------------------
        //Operadores Relacionales
//        var a = 3;
//        var b = 2;
//
//        var c = a > b;
//        System.out.println("g = " + c);
//
//        var d = a >= b;
//        System.out.println("d = " + d);
//
//        if (a % 2 == 0) {
//            System.out.println("Es par");
//        } else {
//            System.out.println("Es impar");
//        }
//
//        var edad = 18;
//        if (edad >= 18) {
//            System.out.println("Es mayor");
//        } else {
//            System.out.println("Es menor");
//        }
//--------------------------------------------------------------
        //Operadores Condicionales
        //AND
//        var a = 8;
//        var valorMin = 0;
//        var valorMax = 10;
//
//        var resultado = a >= 0 && a <= 10;
//
//        if (resultado) {
//            System.out.println("Dentro de rango");
//        } else {
//            System.out.println("Fuera de rango");
//        }
        //ORD
//        var vacaciones = true;
//        var diaDescanso = false;
//        
//        if (diaDescanso || vacaciones) {
//            System.out.println("Si voy");
//        } else {
//            System.out.println("No puedo");
//        }
//-------------------------------------------------------------- (Me encanto)
        //Operador Ternario 
//        var resultado = (1 > 2) ? "Verdadero" : "Falso"; //es como el if else pero mas resumido
//        System.out.println("resultado = " + resultado); // Es solo para estructuras sencillas
//        
//        var num =9;
//        resultado = (num%2==0) ? "Es Par":"Es Impar";
//        System.out.println("resultado = " + resultado);
//--------------------------------------------------------------
        //Precedencia de Operadores
//        var x = 5;
//        var y = 10;
//        var z = ++x + y--;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//        
//        var resultado = (4 + 5) * (6 / 3);
//        System.out.println("resultado = " + resultado);
//--------------------------------------------------------------
        //Tarea
//        Scanner terminal = new Scanner(System.in);
//        System.out.print("Proporciona el alto: ");
//        int alto = terminal.nextInt();     
//        System.out.print("Proporciona el ancho: ");        
//        int ancho = terminal.nextInt();
//        int area = alto * ancho;
//        int perimetro = (alto + ancho) * 2;      
//        System.out.println("\nAlto: " + alto + "\nAncho: " + ancho + "\nArea: " + area + "\nPerimetro: " + perimetro);
//--------------------------------------------------------------
        //Tarea
        Scanner terminal = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int num1 = terminal.nextInt();
        System.out.print("Numero 2: ");
        int num2 = terminal.nextInt();

        int mayor = (num1 > num2 ? num1 : num2); //A asi es mas facil

//        if (num1 > num2) {
//            mayor = num1;
//        } else {
//            mayor = num2;
//        }
        System.out.println("\nNumero 1: " + num1 + "\nNumero 2: " + num2 + "\nEl mayor es: " + mayor);

    }

}
