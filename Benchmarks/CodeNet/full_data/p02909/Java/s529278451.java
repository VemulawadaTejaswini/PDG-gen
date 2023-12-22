import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();

		if (X.equals("Sunny")) {
			System.out.println("Cloudy");
		}else {
			if(X.equals("Cloudy")) {
				System.out.println("Rainy");
			}else{
				System.out.println("Sunny");
			}
		}

	}
}
