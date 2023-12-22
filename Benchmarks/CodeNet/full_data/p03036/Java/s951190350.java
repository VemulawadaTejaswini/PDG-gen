import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int r = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			x = r * x - d;
			System.out.println(x);
		}
	}

}
