import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int []b = new int[n];
		
		for(int i = 0; i < n ;i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
 		}
		Arrays.sort(b);
		
		int k = b[n/2];
		int l = b[n/2 - 1];
		
		for(int i = 0 ; i < n ;i++) {
			if(a[i] < k) {
				System.out.println(k);
			}
			if(a[i] >= k) {
				System.out.println(l);
			}
		}

	}

}
