import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = Long.valueOf(scan.next());
		long M = Long.valueOf(scan.next());
		M += N * 2;
		
		System.out.println(M / 4);
		
		scan.close();

	}

}
