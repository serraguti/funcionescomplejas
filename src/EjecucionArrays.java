public class EjecucionArrays {
    public static void main(String[] args) {
        //NECESITAMOS UN ARRAY DE 3 POSICIONES
        //CON TIPO int
        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        int suma = JuegoArrays.sumarNumerosArray(numeros);
        System.out.println("La suma es: " + suma);
    }
}
