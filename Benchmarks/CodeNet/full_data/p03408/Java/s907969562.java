import java.util.*;
public class Main {
	public static int calc(String s, String[] b, String[] r) {
		int buf = 0;
		for(String t: b) {
			if(t.equals(s)) buf++;
		}
		for(String t: r) {
			if(t.equals(s)) buf--;
		}
		return buf;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String[] blue = new String[N];
		for(int i = 0; i < N; i++) {
			blue[i] = stdIn.next();
		}
		
		int M = stdIn.nextInt();
		String[] red = new String[M];
		for(int i = 0; i < M; i++) {
			red[i] = stdIn.next();
		}
		
		int ans = 0;
		for(String t: blue) {
			ans = Math.max(ans, calc(t, blue, red));
		}
		
		System.out.println(ans);

	}

}