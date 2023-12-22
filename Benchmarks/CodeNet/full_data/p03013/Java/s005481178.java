import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan  = new Scanner(System.in);
      	int n = scan.nextInt();	
      	int M = scan.nextInt();	
      	int[] a = new int[M];
      	long ans = 0;
      	ArrayList<Integer> fibo = new ArrayList<>();
      	fibo.add(0);
      	fibo.add(1);
      	//fibo.add(1);
      	for(int  m = 0 ; m < n; m++){
        	fibo.add(fibo.get(m) + fibo.get(m + 1));
        }
      	for(int i = 0; i < M; i++){
        	a[i] = scan.nextInt();	
        }
      	for(int j = 1; j < M; j++){
        	if(Math.abs(a[j] - a[j-1]) == 1){
            	System.out.print("0");
              	System.exit(0);	
            }
        }
      	
      	ans = ans + fibo.get(a[0]);
      	for(int k = 1; k < M; k++){
        	ans = ans * fibo.get(a[k] - a[k - 1]);
        }
      	ans = ans  * fibo.get(n - a[M-1]);
      	if(ans < 1000000007){
        	System.out.print(ans);
        }
      	else{
        	System.out.print(ans % 1000000007);
        }
    }
  	
}