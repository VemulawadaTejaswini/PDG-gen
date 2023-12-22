import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
     int m = sc.nextInt(); 
     int x = Math.min(n, m); 
     String a = ""; 
     String b = ""; 
     
     for(int i = 0; i<m; i++) {
    	 a = "" + n; 
     }
     
     for(int i =0; i<n; i++) {
    	 b = "" + m; 
     }
     
     if(x == n) {
    	 System.out.println(a); 
     }
     else System.out.println(b);
   }
}