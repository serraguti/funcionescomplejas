import java.util.Scanner;

public class EjecucionParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa Pares Impares");
        System.out.println("Introduzca un inicio");
        String entrada = teclado.nextLine();
        int inicio = Integer.parseInt(entrada);
        System.out.println("Introduzca número final");
        entrada = teclado.nextLine();
        int fin = Integer.parseInt(entrada);
        ClaseParesImpares.getRangoNumeros(inicio, fin, true);
        ClaseParesImpares.getRangoNumeros(inicio, fin, false);
        //PODEMOS HACER QUE LA CLASE MAIN NO SEPA QUE TENEMOS ESTE
        //METODO.  SIMPLEMENTE QUE SEA UNA HERRAMIENTA INTERNA 
        //DE LA CLASE PARES Y QUE SOLAMENTE LA UTILICE LA CLASE PARES.
        // ClaseParesImpares.getNumerosImpares(inicio, fin);
    }
}
