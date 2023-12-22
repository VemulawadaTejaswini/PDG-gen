import java.util.*;
public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] X = new int[N]; 
		int ans = 0;
		for (int i = 0; i < N; i++){
			X[i] = sc.nextInt();
		}
		for(int i = 1; i <= N; i++ ){
			int sum = 0;
			for(int k = 1; k<i;k++){
				sum += X[k-1];
			}
			for(int j = i; j <=N; j++){
				int all = sum + X[j-1];
				if (((float)all / i) == (float)A){
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		
	}
}
