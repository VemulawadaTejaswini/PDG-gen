import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int G = 0,P = 0;
		for( int i=0; i<S.length(); i++ ){
			S.charAt(i)=='g' ? G++ : P++;
		}
		System.out.println((G-P)/2);
	}
}
