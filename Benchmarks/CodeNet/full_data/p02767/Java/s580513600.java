import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
       int ans = 0; 
       
      for(int i = 0; i<n; i++) {
    	  ans += Math.pow(sc.nextInt() - n, 2); 
      }
      
      System.out.println(ans);
	}
}
