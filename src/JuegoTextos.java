public class JuegoTextos {

    public static boolean validarISBN(String isbn){
        int sumaisbn = 0;
        //RECORREMOS CADA CARACTER DEL TEXTO
        for (int i = 0; i < isbn.length(); i++){
            char letra = isbn.charAt(i);
            String temporal = String.valueOf(letra);
            int numero = Integer.parseInt(temporal);
            int posicion = i + 1;
            int operacion = numero * posicion;
            sumaisbn += operacion;
        }
        if (sumaisbn%11==0){
            return true;
        }else{
            return false;
        }
    }

    public static int getSumarTexto(String texto) {
        int suma = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            String temporal = String.valueOf(letra);
            // SABEMOS CONVERTIR UN String A int?
            int numero = Integer.parseInt(temporal);
            suma += numero;
        }
        return suma;
    }
}
