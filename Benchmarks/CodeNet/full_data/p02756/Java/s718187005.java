import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int Q = sc.nextInt();
		int count = 0;
		for( int i=0; i<Q; i++ ){
			int a = sc.nextInt();
			if( a==1 ){
				count++;
			}
			if( a==2 ){
				int b = sc.nextInt();
				String ss = sc.next();
				if( b==1 ){
					if( count%2==0 ){
						S = ss + S;
					}else{
						S = S + ss;
					}
				}
				if( b==2 ){
					if( count%2==0 ){
						S = S + ss;
					}else{
						S = ss + S;
					}
				}
			}
		}
		if( count%2!=0 ){
			StringBuffer sb = new StringBuffer(S);
			String STR = sb.reverse().toString();
			System.out.println(STR);
		}else{
			System.out.println(S);
		}
	}
}