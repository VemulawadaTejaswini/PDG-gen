import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();


		System.out.print(Math.min(a,b));
		System.out.print(" ");
		System.out.print(-Math.min(0,n-a-b));

	}

}