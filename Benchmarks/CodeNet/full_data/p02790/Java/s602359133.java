import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
     int m = sc.nextInt(); 
     if(n<m) {
    	 for(int i = 0; i<m; i++) System.out.print(n);
     }
     else for(int i = 0;i<n; i++) System.out.print(m);
   }
}