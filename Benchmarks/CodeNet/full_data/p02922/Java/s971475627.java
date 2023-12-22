import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		
      	int a = scan.nextInt();
      	int b = scan.nextInt();

      
      if(b >= a){
        
        System.out.println(1);
		return;
      }
      
       double rlt2 = Math.ceil((double)b / a);

            	System.out.println((int)rlt2);
    }
}
