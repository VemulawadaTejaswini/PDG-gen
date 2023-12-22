import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long[] a = new long[5];
		long n = sc.nextLong();
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextLong();
		}
		int idx = 0;
		long min = 1000000000;
		for(int i = 0; i < 5; i++) {
			if(min > a[i]) {
				min = a[i];
				idx = i;
			}
		}
		long ans = 0;
		ans += (n + min - 1)/min;
		ans += 4;
		
		
		System.out.println(ans);
		sc.close();
	}
	
}

