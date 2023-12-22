import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static final Map<Integer, Integer> map = new HashMap<>();
	public static final Integer ZERO = Integer.valueOf(0);
	public static int N;
	public static int X;
	public static int Y;
	public static int s;

	public static void main(String[] args) {

		N = in.nextInt();
		X = in.nextInt();
		Y = in.nextInt();
		s = (Y + X) / 2;

		for(int i=1;i<N;i++) {
			for(int j=i+1;j<N+1;j++) {


				if(i <= X) {
					beforeX(i, j);
					continue;
				}

				if(i > X && i < s) {
					middle(i,j);
					continue;
				}

				countUp(j-i);

			}
		}

		for(int i=1;i<N;i++) print(i);

	}

	public static void beforeX(int i, int j) {
		if(j <= s) {
			countUp(j-i);
		} else if(j>s) {
			int toY = Math.abs(X - i)+1;
			int fromY = Math.abs(Y-j);
			countUp(toY+fromY);
		}
	}

	public static void middle(int i, int j) {
		int x_route = i-X+1 + Math.abs(Y-j);
		int simple = j - i;
		countUp(Math.min(x_route, simple));
	}


	public static void countUp(int len) {
		int cnt = map.getOrDefault(len, ZERO);
		map.put(len, cnt+1);
	}

	public static void print(int k) {
		System.out.println(map.getOrDefault(k, ZERO));
	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}