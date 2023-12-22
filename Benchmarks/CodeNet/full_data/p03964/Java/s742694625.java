
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		long []a = new long [n];
		long []b = new long [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Long.parseLong(sc.next());
			b[i] = Long.parseLong(sc.next());
			
		}		
		long ax = a[0];
		long bx = b[0];
		
		for(int i = 1 ;i < n ;i++) {
			if(ax <= a[i] && bx <= b[i]) {
				ax = a[i];
				bx = b[i];
			}
			else if(ax > a[i] || bx > b[i]) {
				long ta = (long)Math.ceil((double)ax/a[i]);
				long tb = (long)Math.ceil((double)bx/b[i]);
				long t = Math.max(ta, tb);
				ax = t*a[i];
				bx = t*b[i];
			}	
		}	
		System.out.println(ax+bx);

		
	}
}

