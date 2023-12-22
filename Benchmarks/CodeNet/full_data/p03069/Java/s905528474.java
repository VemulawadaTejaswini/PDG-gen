
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String s = sc.next();

		
		int []w = new int [n+2];
		int []b = new int [n+2];
		
		for(int i = 0 ; i < n ;i++) {
			w[i+1] = w[i];
			b[i+1] = b[i];
			if(s.charAt(i) == '#') {
				b[i+1]++;
			}
			else {
				w[i+1]++;
			}
		}
		w[n+1] = w[n];
		b[n+1] = b[n];
		int min = n+1;
		for(int i = 0 ; i < n ;i++) {
			int temp = b[i+1] + w[n+1] - w[i+1];
			min = Math.min(min,temp);
		}
		
		System.out.println(min);
	}
}
