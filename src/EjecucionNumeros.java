import java.util.Scanner;

public class EjecucionNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Conjetura de Collatz");
        System.out.println("Introduzca un número");
        String entrada = teclado.nextLine();
        int numero = Integer.parseInt(entrada);
        HerramientasNumeros.mostrarCollatz(numero);
    }
}
