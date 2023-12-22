import java.util.*;
public class Main {
	long num = 0;
	long patty = 0;
	long n = 0;
	long x = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		x = sc.nextLong();
		level(n);
		// 出力
		System.out.println(patty);
	}
	private static boolean level(int lev) {
		if (lev < 0) return true;
		num++;
		if (num == n) return false;
		boolean b = level(lev - 1);
		if (b == false) return false;
		num++;
		patty++;
		if (num == n) return false;
		b = level(lev - 1);
		if (b == false) return false;
		num++;
		if (num == n) return false;
	}
}