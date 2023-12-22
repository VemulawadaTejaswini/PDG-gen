import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long[] a = new Long[N*3];
		
		for(int i = 0; i < N*3 ;i++) {
			a[i] = sc.nextLong();
		}
		
		Arrays.sort(a);
		
		int ans = 0;
		int index = 0;
		
		for(int i = N*3 ; i-2 > index ; i -= 2 ) {
			ans += a[i-2];
			index++;
		}
		System.out.println(ans);
	}
}
