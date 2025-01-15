public class EjecucionArrays {
    public static void main(String[] args) {
        //RECUPERAMOS UN ARRAY CON EL TAMAÑO QUE DESEEMOS
        int[] numeros = JuegoArrays.getArrayRandom(3);
        int suma = JuegoArrays.sumarNumerosArray(numeros);
        System.out.println("La suma es: " + suma);
    }
}
