import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		char[] stone = new char[S.length()];
		for( int i=0; i<S.length(); i++ ){
			stone[i] = S.charAt(i); 
		}
		int count = 0;
		for( int i=1; i<S.length(); i++ ){
			if( stone[i]!=stone[i-1] ){
				count++;
			}
		}
		System.out.println(count);
	}
}
