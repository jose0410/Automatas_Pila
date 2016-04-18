import java.util.Scanner;
import java.util.Stack;
public class PracticaLenguaje{
 public static void main(String [] args){
     Scanner s = new Scanner(System.in);
     String cadena = s.next();
     Stack Pila = new Stack();
     int estados = 1;
     char caracterFinal = 'f';
     char [] reconocer = cadena.toCharArray();
     int fin = 0;
     
      while(reconocer[fin]!= caracterFinal){
                 if(estados == 1){
                     switch(Pila.peek()){;

                case '(':

                    if('(' == reconocer[fin]){
                        Pila.push(););
}

                    if(')' == reconocer[fin]){
                        Pila.pop(););
}

                    if('f' == reconocer[fin]){
                        Pila.error);
}

                case 'v':

                    if('(' == reconocer[fin]){
                        Pila.push(););
}

                    if(')' == reconocer[fin]){
                        Pila.error);
}

                    if('f' == reconocer[fin]){
                        Pila.aceptar);
}

                                 }
                             }
                     }
                 if(estados == 2){
                     switch(Pila.peek()){;

                                 }
                             }
                 if(estados == 3){
                     switch(Pila.peek()){;

             }
         }
         fin++;
     }
 }

