import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		long K = stdIn.nextLong();
		long sub;
		
		while(true) {
			sub = Math.abs(N - K);
			if(N <= sub) {
				break;
			}else {
				N = sub;
			}
		}
		System.out.println(N);
	}
}