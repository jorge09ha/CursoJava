package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        Aritmetica operacion = new Aritmetica();
        operacion.a = 3;
        operacion.b = 2;
        operacion.suma();

        int resultado = operacion.sumarConRetorno();
        System.out.println("resultado desde main= " + resultado);

    }
}
