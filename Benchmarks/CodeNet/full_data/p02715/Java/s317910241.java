import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int i = 0;
		long sum =0, cnt = 0;
		long[] a = new long[(int) (n + 1)];
		while (i < n) {
			a[i] = sc.nextInt();
			i++;
		}
		cnt = n / 2;
		for(int idx = 0; idx < cnt; idx++) {
			if(cnt % 2 == 0) sum +=a[idx + 1];
			else sum+=a[idx];
		}
		System.out.println(sum);
	}
}
