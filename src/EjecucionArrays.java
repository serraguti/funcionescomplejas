public class EjecucionArrays {
    public static void main(String[] args) {
        //NECESITAMOS UN ARRAY DE 3 POSICIONES
        //CON TIPO int
        int[] numeros = new int[3];
        numeros[0] = 99;
        numeros[1] = 2;
        numeros[2] = 1;
        int suma = JuegoArrays.sumarNumerosArray(numeros);
        System.out.println("La suma es: " + suma);
    }
}
