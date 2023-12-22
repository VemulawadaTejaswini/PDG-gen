import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int Q = sc.nextInt();
		for( int i=0; i<Q; i++ ){
			int a = sc.nextInt();
			if( a==1 ){
				int N = S.length();
				String STR = S;
				for( int k=N-1; k>=0; k-- ){
					char cc = STR.charAt(k);
					String ss = String.valueOf(cc);
					STR = STR + ss;
				}
				S = STR.substring(N);
			}
			if( a==2 ){
				int b = sc.nextInt();
				String ss = sc.next();
				if( b==1 ){
					S = ss + S;
				}
				if( b==2 ){
					S = S + ss;
				}
			}
		}
		System.out.println(S);
	}
}
