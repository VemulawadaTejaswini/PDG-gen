import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] body = s.toCharArray();
		int n = s.length();
		long k = in.nextLong();
		in.close();

		// sが1文字
		if ( n == 1 ) {
			System.out.println(k / 2);
			return;
		}

		long cnt = 0;
		int temp = 1;
		int kind = 1;
		for ( int i = 1; i < n; i++ ) {
			if ( body[i - 1] == body[i] ) {
				temp++;
			} else {
				cnt += (temp / 2);
				temp = 1;
				kind++;
			}
		}
		cnt += (temp / 2);

		// 先頭と末尾が別文字 or 繰り返しが1回のみ
		if ( body[0] != body[n - 1] || k == 1) {
			System.out.println(cnt * k);
			return;
		}
		
		// sが1種類の文字からなる
		if ( kind == 1 ) {
			System.out.println(n * k / 2);
			return;
		}

		// それ以外
		int idx = 1;
		int head = 1;
		while ( idx < n && body[idx - 1] == body[idx] ) {
			head++;
			idx++;
		}

		idx = n - 1;
		int tail = 1;
		while ( 0 <= idx && body[idx - 1] == body[idx] ) {
			tail++;
			idx--;
		}
		
		// System.out.println("h:" + head + " t:" + tail + " c:" + cnt);
		
		long ans = (cnt - head/2 - tail/2 + (head + tail)/2)*k - (head + tail)/2 + head/2 + tail/2;
		System.out.println(ans);

	}
}