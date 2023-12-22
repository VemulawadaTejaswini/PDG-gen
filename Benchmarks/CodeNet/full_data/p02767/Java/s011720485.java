import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
       int ans = 0; 
       int median = 0; 
       int arr[]  = new int[n]; 
       
      for(int i = 0; i<n; i++) {
    	  arr[i] = sc.nextInt(); 
    	  
    	  median += arr[i];  
      } 
      for(int i = 0; i<n; i++) {
    	  ans += Math.pow(arr[i] - ((median/n)+1), 2);
      }
       
      System.out.println(ans);
	}
}