import java.util.Scanner;

public class EjecucionTextos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un texto numérico");
        String texto = teclado.nextLine();
        int suma = JuegoTextos.getSumarTexto(texto);
        System.out.println("La suma de " + texto + " es " + suma); 
    }
}
