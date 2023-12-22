
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ;i < n-1 ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		int []b = new int [n];
		
		for(int i= 0 ; i < n-1 ;i++) {
			b[a[i]-1]++;
		}
		
		for(int i = 0 ; i < n ;i++) {
			System.out.println(b[i]);
		}

	}

}
