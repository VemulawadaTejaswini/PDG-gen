import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan  = new Scanner(System.in);
      	int n = scan.nextInt();	
      	int M = scan.nextInt();	
      	int[] a = new int[M];
      	int ans = 0;
      	for(int i = 0; i < M; i++){
        	a[i] = scan.nextInt();
        }
      	ans = ans + fibo(a[0]);
      	for(int k = 1; k < M; k++){
          	if(a[k] - a[k-1] == 1){
            	System.out.print("0");
              	break;	
            }
        	ans = ans + fibo(a[k + 1] - a[k]);
        }
      	ans = ans  + fibo(n - a[M-1]);
      	if(ans < 1000000007){
        	System.out.print(ans);
        }
      	else{
        	System.out.print(ans % 1000000007);
        }
    }
  	public static int fibo(int n ){
    	if(n == 1 || n == 2){
        	return 1;
        }
      	else {
        	return fibo(n-1) + fibo(n-2);
        }
    }
 
}