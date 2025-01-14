public class ClaseParesImpares {

    public static void getRangoNumeros(int inicio, int fin, boolean pares){
        if (pares == true){
            getNumerosPares(inicio, fin);
        }else{
            getNumerosImpares(inicio, fin);
        }
    }

    private static void getNumerosPares(int inicio, int fin){
        //BUCLE DESDE INICIO HASTA FIN
        for (int i = inicio; i <= fin; i++){
            //PREGUNTAMOS POR LOS PARES
            if (i % 2 == 0){
                System.out.println("par: " + i);
            }
        }
    }

    private static void getNumerosImpares(int inicio, int fin){
        //BUCLE DESDE INICIO HASTA FIN
        for (int i = inicio; i <= fin; i++){
            //PREGUNTAMOS POR LOS IMPARES
            if (i % 2 != 0){
                System.out.println("impar: " + i);
            }
        }
    }    
}
