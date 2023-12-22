import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] h = new int[n];
      	for (int i = 0; i < n; i++){
        	h[i] = scan.nextInt();
        }
      	int max = h[0];
      	int counter = 1;
      	for (int j = 0; j < n - 1; j ++){
        	if(max <= h[j + 1]){
            	max = h[j + 1];
              	counter++;
            }
        }
      	System.out.print(counter);
    
    }
 
}