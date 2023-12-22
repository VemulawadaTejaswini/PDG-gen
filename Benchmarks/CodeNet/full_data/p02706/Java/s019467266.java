import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int total =0;
		
		for(int i=0; i<m; i++) {
			total += sc.nextInt();
		}
		
		if ( n >= total) {
			System.out.println(n-total);
		}else {
			System.out.println(-1);
		}
	}
}
