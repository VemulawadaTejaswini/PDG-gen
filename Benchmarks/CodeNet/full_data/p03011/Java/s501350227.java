import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r= sc.nextInt();
		int minimumL = Math.min(Math.min(p,q),r);
		System.out.println(p+q+r-minimumL);

	}
}
