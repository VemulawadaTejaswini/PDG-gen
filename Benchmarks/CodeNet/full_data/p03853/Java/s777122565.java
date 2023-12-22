import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int W = scan.nextInt();
        String C[] = new String[H];
        //String cnt[] = new String[H*2];
        
        for(int i = 0 ; i < H ; i++){
          C[i] = scan.next();
        }
        
        for(int i = 0 ; i < H ; i++){
          for(int j = 0 ; j < 2 ; j++){
          System.out.println(C[i]);
          }
        }
        
	  }
}