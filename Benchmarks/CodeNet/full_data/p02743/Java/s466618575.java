import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
      
        double aa = Math.sqrt(a);
        double bb = Math.sqrt(b);
        double cc = Math.sqrt(c);
        
        if(aa+bb < cc){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
        
	}
}