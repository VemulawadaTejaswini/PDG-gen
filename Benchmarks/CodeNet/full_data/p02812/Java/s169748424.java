import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		int count = 0;
		for( int i=0; i<=N-3; i++ ){
			char ch1 = S.charAt(i);
			char ch2 = S.charAt(i+1);
			char ch3 = S.charAt(i+2);
			if( ch1=='A' && ch2=='B' && ch3=='C' ){
				count++;
			}
		}
		System.out.println(count);
	}
}
