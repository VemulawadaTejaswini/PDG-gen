import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[] ans = new int[N+1];
		for( int i=0; i<=N-2; i++ ){
			if( S.charAt(i)=='A' && S.charAt(i+1)=='C' ){
				ans[i+2] += ans[i+1]+1;
			}else{
				ans[i+2] += ans[i+1];              
            }              
		}              
		for( int i=0; i<Q; i++ ){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(ans[b] - ans[a]);          
		}
	}
}
