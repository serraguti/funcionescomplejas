import java.util.Scanner;

public class EjecucionTabla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tabla de multiplicar");
        System.out.println("Introduzca número");
        String entrada = teclado.nextLine();
        int numero = Integer.parseInt(entrada);
        HerramientasTabla.mostrarTablaMultiplicar(numero);
    }
}
