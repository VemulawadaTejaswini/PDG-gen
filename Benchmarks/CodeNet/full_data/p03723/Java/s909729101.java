import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		int count =0;
		while (A%2==0&&B%2==0&&C%2==0 &&count<100000) {
			long tempA= B/2+C/2;
			long tempB= A/2+C/2;
			long tempC= B/2+A/2;
			A= tempA;
			B= tempB;
			C= tempC;
			count ++;
		}
		if (count ==100000) {
			System.out.println(-1);
		} else {
			System.out.println(count);
		}
	}
}