import java.util.*;
 
public class Main {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int a[] = new int[n];
		int b[] = new int[n - 1];
		int sum = 0;
		
		for(int i = 0; i < n - 1; i++){
		    b[i] = stdIn.nextInt();
		}
		
		sum += b[0];
		sum += b[n - 2];
		
		for(int i = 0; i < n - 2; i++){
	        if(b[i] > b[i + 1]){
	            sum += b[i + 1];
	        }else{
	            sum += b[i];
	        }
		}
		
		System.out.println(sum);
		
	}
}