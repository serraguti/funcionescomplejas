public class HerramientasNumeros {
    public static void mostrarCollatz(int numero) {
        //6
        while (numero != 1) {
            //String mensaje = getMensajeCollatz(numero);
            //System.out.println(mensaje);
            int num = getNumeroCollatz(numero);
            numero = num;
            System.out.println(num);
        }
    }

    // VAMOS A CREAR UN METODO private QUE NOS DEVOLVERA EL NUMERO
    //8, 15
    private static int getNumeroCollatz(int numero) {
        // COMPROBAMOS EL NUMERO
        if (numero % 2 == 0) {
            // DIVIDIMOS ENTRE 2
            numero = numero / 2;
        } else {
            // MULTIPLICAMOS POR 3 + 1
            numero = numero * 3 + 1;
        }
        return numero;
    }

    // VAMOS A CREAR UN METODO private QUE NOS DEVOLVERA EL MENSAJE
    // "par: " 8, "impar: " + 15
    private static String getMensajeCollatz(int numero) {
        // COMPROBAMOS EL NUMERO
        String mensaje = "";
        if (numero % 2 == 0) {
            // DIVIDIMOS ENTRE 2
            numero = numero / 2;
            mensaje = "Par: " + numero;
        } else {
            // MULTIPLICAMOS POR 3 + 1
            numero = numero * 3 + 1;
            mensaje = "Impar: " + numero;
        }
        return mensaje;
    }
}
