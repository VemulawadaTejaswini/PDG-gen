import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner stdIn = new Scanner(System.in);
    	int a = stdIn.nextInt();
    	int kisuu = 0;
    		for(int i = 0; i < a; i++){
              if(i%2!=0){
                kisuu++;
              }
         System.out.println(kisuu/a);
            }
  }
                
                
  		