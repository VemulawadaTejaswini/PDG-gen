import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] s = new int[N+1];
		int total = 0;
		for( int i=1; i<=N; i++ ){
			s[i] = sc.nextInt();
			total += s[i];
		}
		Arrays.sort(s);
		int ans = 0;
		int dis = 0;
		int a = 1;
		int b = 0;
		for( int i=1; i<=N; i++ ){
			if( s[i]%10!=0 ){
				break;
			}
			if( i==N ){
				ans = 0;
				b = 1;
			}
		}
		if( total%10!=0 ){
			ans = total;
		}else if(b==0){
			for( int i=1; i<=N; i++ ){
				if( s[i]%10!=0 ){
					ans = total - s[i];
					break;
				}
			}			
		}
		System.out.println(ans);
	}
}
