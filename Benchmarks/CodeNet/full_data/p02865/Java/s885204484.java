import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int n = scan.nextInt();
        int cnt = 0;
        
        if( n % 2 == 0 ){
         cnt = (n / 2) - 1; 
        }
        
        else{
          cnt = (int)(n / 2);
        }
            
        System.out.println(cnt);
	  }
}