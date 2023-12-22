import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String ss = sc.next();
		char[] ch = new char[N];
		for( int i=0; i<N; i++ ){
			ch[i] = ss.charAt(i);
		}
		int count = 0;
		for( int i=0; i<N-1; i++ ){
			if( ch[i]==ch[i+1] ){
				ch[i]=0;
				count++;
			}
		}
		System.out.println(N-count);
	}
}
