import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String result = s.substring(0,k-1) + s.substring(k-1,k).toLowerCase() + s.substring(k,n);


		System.out.println(result);
	}
}
