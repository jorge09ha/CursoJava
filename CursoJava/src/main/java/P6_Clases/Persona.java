package P6_Clases;

public class Persona {

    //Atributo: Caracteristica que asociamos a nuestra clase
    String nombre, apellido1, apellido2, cedula;

    /**
     * Metodos: parte de codigo que se puede reutilizar. se puede mandar a
     * llamar tantas veces como se nesesite un metodo puede regresar un valor ==
     * valor de retorno
     *
     * Argumentos: Son los valores de los metodos.
     *
     */
    //void no regresa informacion, un metodo puede resivir o no argumentos
    public void verInfo() {

        System.out.println("Nombre: " + nombre + "\nPrimer Apellido: " + apellido1 + "\nSegundo Apellido: "
                + apellido2 + "\nCedula: " + cedula);
    } //Podemos acceder a las var sin que esten definidas dentro del metodo

}
