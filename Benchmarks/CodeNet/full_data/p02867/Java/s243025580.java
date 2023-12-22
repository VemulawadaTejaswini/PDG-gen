import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		for (int i = 0; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		for (int i = 0; i < n ; i++) {
			b[i] = Integer.parseInt(sc.next());			
		}

		Arrays.sort(a,  Collections.reverseOrder());
		Arrays.sort(b,  Collections.reverseOrder());
		
		String ans = "Yes";
		for (int i = 0; i < n ; i++) {
			if(a[i] > b[i]) {
				ans = "No";
				break;
			}
		}

		
		System.out.println(ans);
	}
	
}