import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		S = "A" + S;
		for( int i=1; i<=S.length()-3; i++ ){
			char ch1 = S.charAt(i);
			char ch2 = S.charAt(i+1);
			char ch3 = S.charAt(i+2);
			if( ch1==ch2 || ch1==ch3 || ch2==ch3 ){
				System.out.println(i+" "+(i+2));
				break;
			}
			if( i==S.length()-2 ){
				System.out.println("-1"+" "+"-1");
			}
		}
	}
}
