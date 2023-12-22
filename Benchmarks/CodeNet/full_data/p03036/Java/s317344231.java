import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long r = in.nextLong();
		long d = in.nextLong();
		long x = in.nextLong();
		for(int i=0;i<10;i++) {
			x = r*x-d;
			System.out.println(x);
		}
		in.close();

	}

}
