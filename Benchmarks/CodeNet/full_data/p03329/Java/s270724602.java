import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(count(N, 0));
	}
	
	public static int count(int num, int cnt) {
		if(num < 6) {
			return cnt + num;
		}
		int a = 1;
		int b = 1;
		while(num >= a * 6) a *= 6;
		while(num >= b * 9) b *= 9;
		return Math.min(count(num - a, cnt + 1), count(num - b, cnt + 1));
	}
}
