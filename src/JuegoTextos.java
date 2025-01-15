public class JuegoTextos {
   public static int getSumarTexto(String texto){
        int suma = 0;
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            String temporal = String.valueOf(letra);
            //SABEMOS CONVERTIR UN String A int?
            int numero = Integer.parseInt(temporal);
            suma += numero;
        }        
        return suma;
   }
}
