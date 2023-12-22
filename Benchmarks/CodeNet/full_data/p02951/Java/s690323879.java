import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan  = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] h = new int[n];
      	int[] c = new int[n];
      	int counter = 0;
      	for(int i = 0; i < n; i++){
        	h[i] = scan.nextInt();
          	c[i] = h[i];//copied 
        }
      	Arrays.sort(c);//copied array was sorted
      	if(n == 1){
        	System.out.print("Yes");
        }
      	for(int i = 0; i < n; i ++){
        	if(h[i] >= c[i] + 1 || h[i] == c[i] || h[i] <= c[i] + 1){
              	counter ++;
            }
        }
      	if(counter == n ){
        	System.out.print("Yes");
        }
      	else{
        System.out.print("No");
        }
      	
    }
}