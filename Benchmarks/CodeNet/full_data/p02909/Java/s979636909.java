import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String x = scan.nextLine();
		String s = "Sunny";
		String c = "Cloudy";
		String r = "Rainy";
		if(x.equals(s)) {
			System.out.println("Cloudy");
		}
		else if(x.equals(c)) {
			System.out.println("Rainy");
		}
		else if(x.equals(r)) {
			System.out.println("Sunny");
		}
	}
}
