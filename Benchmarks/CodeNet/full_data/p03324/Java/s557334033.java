import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
      	int n = sc.nextInt();
      	int s = n * (int)Math.pow(100,d);
 		
      	if(n == 100) s += (int)Math.pow(100,d);
          
      	System.out.println(s);
        
	}
}
