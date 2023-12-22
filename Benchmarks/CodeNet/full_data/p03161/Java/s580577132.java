import java.util.Scanner;
import java.lang.Math;

class Main{
  
  	static int solve(int n, int k, int[] arr){
    	int[] dp = new int[n];
      	dp[0] = 0;
        dp[1] = Math.abs(arr[0] - arr[1]);
      
      	for(int i = 2; i < n; i++){
        	int min = dp[i-1] + Math.abs(arr[i-1] - arr[i]);
          
          	for(int j = 1; j <= k; j++){
            	if(i - j < 0)
                      break;

              	int h = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
              	min = (h <= min) ? h : min;
            }
          	dp[i] = min;
        }
      
      	return dp[n-1];
    }

	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      	int n = scanner.nextInt();
      	int k = scanner.nextInt(); scanner.nextLine();
      	int[] arr = new int[n];
      	
      	for(int i = 0; i < n; i++){
        	arr[i] = scanner.nextInt();
        }
      
      	System.out.println(Main.solve(n,k,arr));
      
      	scanner.close();
    }
}