package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 3;
        aritmetica.b = 2;
        aritmetica.suma();

        int resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado desde main= " + resultado);

        resultado = aritmetica.sumarConArgumentos(5, 5);
        System.out.println("resultado = " + resultado);

    }
}
