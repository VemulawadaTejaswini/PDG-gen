import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int L = sc.nextInt();
			int[] street = new int[N];
			int[] train = new int[N];
			// 道路
			for (int i = 0; i < K; i++) {
				int p = sc.nextInt();
				int q = sc.nextInt();
				street[p - 1] = 1;
				street[q - 1] = 1;
			}
			// 鉄道
			for (int i = 0; i < L; i++) {
				int r = sc.nextInt();
				int s = sc.nextInt();
				train[r - 1] = 1;
				train[s - 1] = 1;
			}
			String[] citiesStr = new String[N];
			for (int i = 0; i < street.length; i++) {
				citiesStr[i] = Integer.toString(street[i] + train[i]);
			}
			System.out.println(String.join(" ", citiesStr));
		}
	}
}
