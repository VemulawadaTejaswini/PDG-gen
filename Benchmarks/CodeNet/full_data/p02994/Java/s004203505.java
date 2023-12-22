import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int L = sc.nextInt();
		int max = L + num - 1;
		if(L * max <= 0) {
			System.out.println(num * (L + max) / 2);
		}else {
			System.out.println(num * (L + max) / 2 - (Math.abs(L) <= Math.abs(max) ? L : max));
		}
	}
}