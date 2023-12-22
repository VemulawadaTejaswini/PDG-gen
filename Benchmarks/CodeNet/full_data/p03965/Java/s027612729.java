import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int G = 0,P = 0;
		for( int i=0; i<S.length(); i++ ){
			if( S.charAt(i)=='g' ){
				G++;
			}else{
				P++;
			}
		}
		System.out.println((G-P)/2);
	}
}
