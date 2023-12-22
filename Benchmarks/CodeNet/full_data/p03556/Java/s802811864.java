import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long result=0;
		for (long i=1;i*i<=N;i++) {
			result =i*i;
		}
		System.out.println(result);
	}
}