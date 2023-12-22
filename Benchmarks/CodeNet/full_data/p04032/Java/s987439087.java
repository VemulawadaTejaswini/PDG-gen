import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		S = "A" + S;
		for( int i=1; i<=S.length()-2; i++ ){
			char ch1 = S.charAt(i);
			char ch2 = S.charAt(i+1);
			if( ch1==ch2 ){
				System.out.println(i+" "+(i+1));
				break;
			}
			if( i==S.length()-2 ){
				System.out.println("-1"+" "+"-1");
			}
		}
	}
}
