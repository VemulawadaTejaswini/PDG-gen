import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の標準入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] xCityCoordinate = new int[n];
		// 整数nの数だけ標準入力
		for(int i = 0; i < n; i++) {
			// 整数xとの差分
			xCityCoordinate[i] = Math.abs(x - sc.nextInt());
		}
		Arrays.sort(xCityCoordinate);
		System.out.println(xCityCoordinate[0]);
		sc.close();
	}
}