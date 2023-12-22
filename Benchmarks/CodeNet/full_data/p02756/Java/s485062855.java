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
				String STR = S;
				StringBuffer sb = new StringBuffer(STR);
				S = sb.reverse().toString();
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
