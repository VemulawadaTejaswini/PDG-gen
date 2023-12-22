import java.util.*;
class Main{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		int n = input.nextInt();
		long A[] = new long[n+1];
		long B[] = new long[n+1];
		for(int i= 0 ;i < n+1 ; i++)
			A[i] = input.nextInt();
		for(int i = 0 ;i < n; i++)
			B[i] = input.nextInt();
		long ans = 0 ,left = 0;
		for(int i = 0 ;i < n+1 ; i++){
			if(A[i] > left + B[i]){
				ans += left + B[i];
				left = 0;
			}
			else if(A[i] < left){
				ans += A[i];
				left = B[i];
			}
			else{
				ans += A[i];
				left = B[i] - A[i] + left;
			}
		}
		System.out.println(ans);
	}		
}