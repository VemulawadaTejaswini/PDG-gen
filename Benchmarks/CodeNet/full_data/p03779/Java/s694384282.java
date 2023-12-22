
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();

		long t = 1;

		while(true){
			if(mySigma(t) >= X)break;
			t++;
		}
		System.out.println(t);
	}

	public static long mySigma(long n){
		return (n * (n + 1)) / 2;
	}
}
