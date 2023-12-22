import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //整数の入力
		long x = sc.nextLong();
		StringBuilder sb = new StringBuilder();
		sb.append('p');
		for (int i = 0; i < n; i++) {
			StringBuilder tmp = new StringBuilder();
			tmp.append('b');
			tmp.append(sb);
			tmp.append('p');
			tmp.append(sb);
			tmp.append('b');
			sb = tmp;
		}
		long total = 0;
		long size = sb.length();
		for (long i = 0; i < x; i++) {
			if (sb.charAt(i) == 'p') {
				total++;
			}
		}
		System.out.println(total);
	}
}