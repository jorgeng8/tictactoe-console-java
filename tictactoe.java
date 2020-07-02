
import java.util.Scanner;

public class tictactoe
 {
     // el método main empieza la ejecución de la aplicación en Java
 public static void main( String args[] )
 {
    Scanner entrada = new Scanner( System.in );
    
    String[][] myArr= { { "-", "-", "-" }, { "-", "-", "-" }, { "-", "-", "-" } };
    
     int numero1; 
    int numero2; 
    
    boolean run=true;
    int jugador=1;
while (run==true){
    //System.out.print().clean();
    System.out.print("Jugador "+jugador);
    System.out.print("Escriba el primer ubicacion de matriz Y: "); // indicador
    
    numero1 = entrada.nextInt();
  

    System.out.print("Escriba el segundo ubicacion matriz X: "); // indicador

    numero2 = entrada.nextInt();
          
    // si esta ocupado por la letra de otro
    if (jugador==1){
        
        if (myArr[numero1][numero2]=="O"){
            //myArr[numero1][numero2]="O";
            jugador=2;
            System.out.print("NO PUEDE PONER EN UN PUESTO OCUPADO");

            
        }else if(myArr[numero1][numero2]=="X"){
            jugador=2;
            System.out.print("NO PUEDE PONER EN UN PUESTO OCUPADO POR EL MISMO");
            
            
        }else{
            myArr[numero1][numero2]="X";
            System.out.print("jugador 1");
        }
    }else
    
    if (jugador==2)
    {
        if (myArr[numero1][numero2]=="X"){
           
            jugador=1;
            System.out.print("NO PUEDE PONER EN UN PUESTO OCUPADO");

        }else if(myArr[numero1][numero2]=="O"){
            jugador=1;
            System.out.print("NO PUEDE PONER EN UN PUESTO OCUPADO POR EL MISMO");
            
            
        }else{
            myArr[numero1][numero2]="O";
            System.out.print("jugador 2");
        }
        
    }
    //si esta ocupado por su mismo letra
    
   
    System.out.println("\n");
    
    for(int i = 0; i < myArr.length; i++){
        for(int j = 0; j < myArr[i].length; j++){
            System.out.print(myArr[i][j] + " ");	// Imprime elemento
        }
        System.out.println();	// Imprime salto de línea
    }
   //contador++;
   //cambiar de jugador
   if (jugador==1){
        jugador=2;
            
         }else if (jugador==2){
         jugador=1;
             
    }
    //validar ganador
    if(
    ((myArr[0][0]=="O")&&(myArr[0][1]=="O")&&(myArr[0][2]=="O"))||
    ((myArr[1][0]=="O")&&(myArr[1][1]=="O")&&(myArr[1][2]=="O"))||
    ((myArr[2][0]=="O")&&(myArr[2][1]=="O")&&(myArr[2][2]=="O"))||
    ((myArr[0][0]=="O")&&(myArr[1][1]=="O")&&(myArr[2][2]=="O"))||
    ((myArr[0][2]=="O")&&(myArr[1][1]=="O")&&(myArr[2][0]=="O"))
    ){
        System.out.println("JUGADOR 2 GANADOR!!!! ");
        run=false;
        
    }
    if(
    ((myArr[0][0]=="X")&&(myArr[0][1]=="X")&&(myArr[0][2]=="X"))||
    ((myArr[1][0]=="X")&&(myArr[1][1]=="X")&&(myArr[1][2]=="X"))||
    ((myArr[2][0]=="X")&&(myArr[2][1]=="X")&&(myArr[2][2]=="X"))||
    ((myArr[0][0]=="X")&&(myArr[1][1]=="X")&&(myArr[2][2]=="X"))||
    ((myArr[0][2]=="X")&&(myArr[1][1]=="X")&&(myArr[2][0]=="X"))
    ){
        System.out.println("JUGADOR 1 GANADOR!!!!!!!!!");
        run=false;
    }

} 
     entrada.close();
 } 

} // fin de la clase Bienvenido1