
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n+1];
		for( int i=0 ; i<n ; i++ ) {
			a[i] = sc.nextInt();
		}
		
		for( int i=0 ; i<n ; i++ ) {
			b[i+1] = a[i]*2 - b[i]; 
		}
		b[0]=b[n]/2;
		for( int i=0 ; i<n ; i++ ) {
			b[i+1] = a[i]*2 - b[i]; 
			System.out.println(b[i]);
		}
	}
}

