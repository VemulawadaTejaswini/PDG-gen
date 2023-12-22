
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

//		int[] p = new int[x];
//		int[] q = new int[y];
//		int[] r = new int[c];
		
		Integer[] s = new Integer[ a+b+c];
		int si =0;
		for( int i=0; i< a ; i++ ) {
//			if( i<x )
				s[si++] = sc.nextInt();
//			else 
//				sc.nextInt();
		}
		Arrays.sort(s, 0,si, Collections.reverseOrder());
		si = x;
		
		for( int i=0; i< b ; i++ ) {
//			if( i<y )
				s[si++] = sc.nextInt();
//			else 
//				sc.nextInt();
		}
		Arrays.sort(s, x,si, Collections.reverseOrder());
		si = x+y;

		for( int i=0; i< c ; i++ ) {
			s[si++] = sc.nextInt();
		}
		
		int sum = 0;
		System.err.println(si);
		Arrays.sort(s, 0, si );
		for( int i=si-x-y ; i<si ; i++ ) {
			sum += s[i];
			System.err.println(s[i]);
		}
		System.out.println(sum);
	}
	
}