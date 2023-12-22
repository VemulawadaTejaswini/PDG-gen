import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int alice = 0;
		int bob = 0;
		int check = 0;
		
		for(int i = N - 1; i > -1; i--) {
			if(check == 0) {
				alice += a[i];
				check = 1;
			} else {
				bob += a[i];
				check = 0;
			}
		}
		System.out.println(alice - bob);
	}
}
