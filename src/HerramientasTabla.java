public class HerramientasTabla {
    public static void mostrarTablaMultiplicar(int numero){
        for (int i = 1; i <= 10; i++){
            //PODEMOS REPRESENTAR TODOS LOS FORMATOS
            System.out.println(getMensajeTabla(numero, i, "*"));
            System.out.println(getMensajeTabla(numero, i, "x"));
            System.out.println(getMensajeTabla(numero, i, " por "));
        }
    }

    private static String getMensajeTabla(int num, int multi, String sep){
        int operacion = num * multi;
        return num + sep + multi + "=" + operacion;
    }
}
