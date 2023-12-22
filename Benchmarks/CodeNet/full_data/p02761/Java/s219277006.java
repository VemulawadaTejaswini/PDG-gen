import java.util.*; 
import java.io.*; 
public class Main{
	public static void main(String ...strings ) {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();
       int arr[] = new int[n]; 
       int m = sc.nextInt(); 
       for(int i= 0; i<m; i++) {
    	   int index = sc.nextInt(); 
    	   int value = sc.nextInt(); 
    	   arr[index -1] = value; 
       }
       if(n > 1) {
    	   if(arr[0] == 0) System.out.println(-1); 
    	   else {
    		   for(int i =0; i<n; i++) {
    			   System.out.print(arr[i] );
    		   }
    	   }
       }
       else System.out.println(arr[0]); 
	}
}
