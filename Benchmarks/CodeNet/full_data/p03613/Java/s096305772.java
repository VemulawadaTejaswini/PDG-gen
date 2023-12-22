import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] dis = new int[N];
		for( int i=1; i<=N; i++ ){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);    
		int count = 1;
		int ans = 0;
		int a = 0;
		for( int i=1; i<=N-1; i++ ){
			dis[i] = A[i+1] - A[i];
		}
		for( int i=1; i<=N-1; i++ ){
			a += dis[i];
			if( a<=2 ){
				count++;
				ans = Math.max(ans , count);
			}else{
				count = 1;
				a = 0;
			}
		}
		if( ans==0 ){
			ans = 1;
		}
		System.out.println(ans);
	}
}
