import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		int[] l = new int[n];
		int lIdx = 0;
		int[] r = new int[n];
		int rIdx = 0;
		for( int i=0 ; i<n && lIdx<k; i++ ) {
			while( s[i] == 'x' ) {
				i++;
			}
			l[lIdx++] = i;
			i+= c;
		}

		for( int i=n-1 ; i>=0 && rIdx<k ; i-- ) {
			while( s[i] == 'x' ) {
				i--;
			}
			r[rIdx++] = i;
			i-= c;
		}
		for( int i=0 ; i<n ; i++ ) {
			if(s[i] == 'x') continue;
			for( int x=0 ; x<Math.min(rIdx, lIdx) ; x++ ) {
				if( l[x]==r[rIdx-x-1] && l[x]==i ) {
					System.out.println(i+1);
				}
			}
		}
	}

	private static void reverse(int[] r) {
		for( int i=0 ; i<r.length/2 ; i++) {
			int tmp = r[i];
			r[i]=r[r.length-i-1];
			r[r.length-i-1] = tmp;
		}
	}

}