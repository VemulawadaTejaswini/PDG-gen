import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();
		int[] cc = new int[N+1];
		int ans = 0;
		for( int i=1; i<=K; i++ ){
			char ch = T.charAt(i-1);
			if( ch=='r' ){
				cc[i] = P;
			}
			if( ch=='s' ){
				cc[i] = R;
			}
			if( ch=='p' ){
				cc[i] = S;
			}
		}
		for( int i=K+1; i<=N; i++ ){
			char ch = T.charAt(i-1);
			if( ch=='r' ){
				cc[i] = P;
				if( cc[i-K]==P ){
					cc[i] = R;
				}
			}
			if( ch=='s' ){
				cc[i] = R;
				if( cc[i-K]==R ){
					cc[i] = S;
				}
			}
			if( ch=='p' ){
				cc[i] = S;
				if( cc[i-K]==S ){
					cc[i] = P;
				}
			}			
		}
		for( int i=1; i<=N; i++ ){
			ans += cc[i];
		}
		System.out.println(ans);
	}
}
