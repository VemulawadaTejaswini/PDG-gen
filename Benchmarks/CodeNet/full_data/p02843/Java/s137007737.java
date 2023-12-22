import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int X = in.nextInt();

		int handred = X / 100;
		int ten = (X % 100);

		if(X < 100) {
			System.out.println(0);
			return;
		}

		for(int i=0;i < handred;i++) {
			if (ten >= 5) ten -= 5;
			else if (ten >= 4) ten-=4;
			else if (ten >= 3) ten-=3;
			else if (ten >= 2) ten-=2;
			else if (ten >= 1) ten-=1;
			if(ten == 0) break;
		}

		if (ten == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}