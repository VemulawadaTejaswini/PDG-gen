import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		final float N = scan.nextInt();
		scan.close();
		if(N % 2 == 0){
			System.out.println((N / 2) / N);
		}else {
			System.out.println((Math.floor(N / 2) + 1) / N);
		}
	}
}
