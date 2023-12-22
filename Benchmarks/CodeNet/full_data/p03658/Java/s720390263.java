import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		Integer[] c = new Integer[a];
		
		for(int i=0 ; i<c.length ; i++) {
			c[i] = sc.nextInt();
		}
		
		Arrays.sort(c, Collections.reverseOrder());
		
		int d = 0;
		
		for(int i=0 ; i<b ; i++) {
			d += c[i];
		}
		System.out.println(d);
	}
}