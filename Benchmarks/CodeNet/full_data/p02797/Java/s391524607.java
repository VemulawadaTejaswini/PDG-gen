
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int s = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			if(i < k) {
				a[i] = s;
			}
			else {
				a[i] = (s + 1000);
			}
		}
		
		for(int i = 0 ; i < n-1 ;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print(a[n-1]);
		System.out.println();

	}

}
