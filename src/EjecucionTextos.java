import java.util.Scanner;

public class EjecucionTextos {
    public static void main(String[] args) {
        String isbn = "8441513929";
        boolean respuesta = JuegoTextos.validarISBN(isbn);
        if (respuesta == true){
            System.out.println("ISBN correcto");
        }else{
            System.out.println("El numero ISBN es incorrecto");
        }

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un texto numérico");
        String texto = teclado.nextLine();
        int suma = JuegoTextos.getSumarTexto(texto);
        System.out.println("La suma de " + texto + " es " + suma); 
    }
}
