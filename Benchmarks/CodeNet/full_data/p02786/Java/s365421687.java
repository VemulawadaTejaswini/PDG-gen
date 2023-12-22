import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();

		System.out.println(calc(h));

	}

	public static long calc(long hp) {
		if(hp==1) return 1;
		return 2*calc(hp/2)+1;
	}

}
