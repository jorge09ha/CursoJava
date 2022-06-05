package P6_Clases;

public class Main {

    public static void main(String[] args) {
//--------------------------------------------------------------
        Persona persona1; //Declaracion de la variable
        Persona persona2;
        Persona persona3;
        
       //Se crea el Objeto
        persona1 = new Persona(); //Este es el constructor. Se agrega de manera automatica cuando se crea la clase
        persona1.nombre = "Jorge";
        persona1.apellido1 = "Hernandez";
        persona1.apellido2 = "Araya";
        persona1.cedula = "111111";
        persona1.verInfo();

        persona2 = new Persona(); 
        persona2.nombre = "Hillary";
        persona2.apellido1 = "Molina";
        persona2.apellido2 = "Saborio";
        persona2.cedula = "222222";
        persona2.verInfo();
        
        persona3 = new Persona();
        persona3.nombre ="Juanito";
        persona3.verInfo();
        
        System.out.println("persona3 = " + persona3); //Se puede ver el espacio de memoria asignados
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
//--------------------------------------------------------------
    }

}
