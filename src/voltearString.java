
public class voltearString {
    
    
    /*
    Entradas: STring cadena, int indiceMenor, int indiceMayor
    Salidas: Stirng palabra procesada
    Precondiciones: EL indiceMenor >0 y indiceMayor < longitud de cadena
    Postcondiciones: Devuevle un string con las consonantes de la palabra pasada. La palabra devuelta empieza desde el indice menor hasta el indiceMayor
    
     */
    
    
    public  String voltearString  (String cadena, int indiceMenor, int indiceMayor) {
        
        String palabraProcesada ="";
        char letraProcesada;


        if(cadena == null){

            throw new IllegalArgumentException("La cadena esta vacia");

        }

        if (indiceMayor> cadena.length()){

            throw new IllegalArgumentException("el indiceMayor es mas largo que la cadena");

        }

        if (indiceMenor<0){

            throw new IllegalArgumentException("el indiceMenor no puede ser negativo");

        }

        if (indiceMenor> indiceMayor){

            palabraProcesada = null;

        }




        for (int i = indiceMayor; i >indiceMenor ; i--) {
            
            letraProcesada = cadena.charAt(i);

            if (letraProcesada != 'a' && letraProcesada != 'e' && letraProcesada != 'i' && letraProcesada != 'o' && letraProcesada != 'u' ){

                palabraProcesada += letraProcesada;
            }
            
        }

        return palabraProcesada;
        

    }
    
    
    
}
