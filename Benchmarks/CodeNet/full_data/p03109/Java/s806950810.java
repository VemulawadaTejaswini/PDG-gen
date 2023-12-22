import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = Integer.parseInt(sc.next().substring(5,7));

		System.out.println(m >= 5 ? "TBD" : "Heisei");
	}
}