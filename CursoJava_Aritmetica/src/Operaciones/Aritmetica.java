package Operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a, b;

    //Metodo
    //public = modificador de acceso
    public void suma() {
        int resultado = a + b;
        System.out.println("resultado desde la clase= " + resultado);
    }

    public int sumarConRetorno() {
//        int resultado = a + b; 
//        return resultado; //se puede tambien asi
        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        return a + b;
    }
}
