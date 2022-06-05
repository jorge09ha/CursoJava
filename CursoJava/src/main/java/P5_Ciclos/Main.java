package P5_Ciclos;

public class Main {

    public static void main(String[] args) {

//--------------------------------------------------------------      
//        //while
//        var contador = 0;
//        while (contador < 4) {
//            System.out.println("contador = " + contador);
//            contador++;
//        } //Si la condicion desde el el principio no se cumple no se ejecuta, es la diferencia del ciclo do while
//--------------------------------------------------------------
//        //do while
//        var contador = 0;
//        do {
//            System.out.println("contador = " + contador);
//            contador++;
//        } while (contador < 3); //si es nesesario que se ejecute una vez utilizamos el cilo do while
//--------------------------------------------------------------
//     //for 
//        //Tenemos tres espacios for (variable;condicion;incremento){}
//        for (int contador = 0; contador < 3; contador++) {
//            System.out.println("contador = " + contador); //Cada ves que se ejecuta en una iteración
//        }
//--------------------------------------------------------------
//        //for break 
//        for (int contador = 0; contador < 3; contador++) {
//            if (contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break; //Si esto se cumple se corte el ciclo
//            }
//        }
//        //for  continue
//        for (int contador = 0; contador < 11; contador++) {
//            if (contador % 2 != 0) {
//                continue; //Va a continuar con la siguiente iteración
//            }
//            System.out.println("contador = " + contador);
//        }
//--------------------------------------------------------------
        //for etiquetas (Labels)
        //Nos va permitir ir a un lugar en espesifico de nuestra programa, Se conose como "go to"
        inicio: //
        for (int contador = 0; contador < 11; contador++) {
            if (contador % 2 != 0) {
                continue inicio; //ir a la linea de codigo de la etiqueta
            }
            System.out.println("contador = " + contador);
        }
//--------------------------------------------------------------
    }
}
