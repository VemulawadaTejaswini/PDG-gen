import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] H = new long[N];
		for (int i = 0; i < H.length; i++)
			H[i] = sc.nextLong();
		int ans = 0;
		int count = 0;
		for (int i = 0; i < H.length; i++) {
			if ((i + 1) < H.length && H[i] >= H[i + 1]) {
				count++;
			} else {
				if (ans < count)
					ans = count;
				count = 0;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}