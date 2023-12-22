import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] ans = new long[N+1];
		int b = N/2+1;
		int c = N/2+2;
		int d = N/2;
		if( N%2!=0 ){
			for( int i=1; i<=N; i++ ){
				if( i%2!=0 ){
					ans[b] = Long.parseLong(sc.next());
					b--;
				}else{
					ans[c] = Long.parseLong(sc.next());
					c++;
				}
			}
		}
		if( N%2==0 ){
			for( int i=1; i<=N; i++ ){          
				if( i%2!=0 ){
					ans[b] = Long.parseLong(sc.next());
					b++;
				}else{
					ans[d] = Long.parseLong(sc.next());
					d--;
				}	
            }              
		}
		String ss = "A";
		for( int i=1; i<=N; i++ ){
			ss = ss + " " + String.valueOf(ans[i]);
		}
		System.out.println(ss.substring(2));
	}
}
