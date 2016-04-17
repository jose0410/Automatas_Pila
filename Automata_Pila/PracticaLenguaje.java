public class Reconocedor(){
 public static void main(String [] args){
     Scanner s = new Scanner(System.in);
     String cadena = s.next();
     Stack Pila = new Stack;
     int estados = 1;
     String caracterFinal = 3;
     char [] elementosPila = new char [3];
     char [] elementosEntrada = new char [4];
     char [] reconocer = cadena.toCharArray();
     int fin = 0;
     String [] operaciones1 = new String[8];
     String [] operaciones2 = new String[8];
     String [] operaciones3 = new String[8];

      elementosPila[0] = null;

      elementosPila[1] = 1;

      elementosPila[2] = 2;

      elementosEntrada[0] = null;

      elementosEntrada[1] = 1;

      elementosEntrada[2] = 2;

      elementosEntrada[3] = 3;

      operaciones1[0] = push;

      operaciones1[1] = error;

      operaciones1[2] = aceptar;

      operaciones1[3] = aceptar;

      operaciones1[4] = aceptar;

      operaciones1[5] = aceptar;

      operaciones1[6] = aceptar;

      operaciones1[7] = aceptar;

      operaciones2[0] = null;

      operaciones2[1] = null;

      operaciones2[2] = null;

      operaciones2[3] = null;

      operaciones2[4] = null;

      operaciones2[5] = null;

      operaciones2[6] = null;

      operaciones2[7] = null;

      operaciones3[0] = null;

      operaciones3[1] = null;

      operaciones3[2] = null;

      operaciones3[3] = null;

      operaciones3[4] = null;

      operaciones3[5] = null;

      operaciones3[6] = null;

      operaciones3[7] = null;

      while(reconocer[fin]!= caracterFinal){
         for(int w = 0; w < operaciones1.length; w++){
             for(int j = 0; j < elementosPila.length; j++){
                              if(estados == 1){                     switch(Pila.peek()){;                         case elementosPila[j]:                             for(int y = 0; y < elementosEntrada; y++){                                 switch(reconocer[y]){                                     case elementosEntrada[y]:
                                          push
                                          error
                                          aceptar
                                          aceptar
                                 }                             }                     }                 }                 if(estados == 2){                     switch(Pila.peek()){;                         case elementosPila[j]:                             for(int y = 0; y < elementosEntrada; y++){                                 switch(reconocer[y]){                                     case elementosEntrada[y]:
                                          null
                                          null
                                          null
                                          null
                                 }                             }                     }                 }                 if(estados == 3){                     switch(Pila.peek()){;                         case elementosPila[j]:                             for(int y = 0; y < elementosEntrada; y++){                                 switch(reconocer[y]){                                     case elementosEntrada[y]:
                                          null
                                          null
                                          null
                                          null
             }         }         fin++;     } }}
