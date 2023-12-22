import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();

		int left = 1;
		int right = 50001;
		while(left < right) {
			int mid = (left+right) / 2;
			int taxIn = taxIn(mid);
			if (taxIn == N) {
				System.out.println(mid);
				return;
			}
			else if (taxIn > N) right = mid;
			else if (taxIn < N) left = mid+1;
		}

		System.out.println(":(");

	}

	public static int taxIn(int X) {
		return (int)(X * 1.08);
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}