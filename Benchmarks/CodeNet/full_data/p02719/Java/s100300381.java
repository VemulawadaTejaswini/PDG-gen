import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		long i1 = n%k;
		long i2 = Math.abs(i1-k);
		long ans = Math.min(i1, i2);
		System.out.println(ans);
		sc.close();
	}
}
