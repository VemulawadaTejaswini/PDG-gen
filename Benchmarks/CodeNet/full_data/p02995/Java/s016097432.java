import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long ans = 0;
        
        for (long i = a; i <= b; i++) {
            if (i % c != 0 && i % d != 0) {
                ans++;
            }
        }
        System.out.println(ans);

		sc.close();
	}
}
