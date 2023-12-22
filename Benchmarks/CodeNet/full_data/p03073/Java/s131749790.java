import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = str.length();
		boolean isWhite[] = new boolean[num];
		for(int i = 0; i < num; i ++) {
			isWhite[i] = str.charAt(i) == '1';
		}
		int min = 100100;
		for(int i = 0; i < 2; i ++) {
			int count = 0;
			for(int j = 0; j < num; j ++) {
				count += (j + i) % 2 == 1 != isWhite[j] ? 1 : 0;
			}
			min = Math.min(min, count);
		}
		System.out.println(min);
	}
}