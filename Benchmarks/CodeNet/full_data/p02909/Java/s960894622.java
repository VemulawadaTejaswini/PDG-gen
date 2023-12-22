import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.contentEquals("Sunny")) System.out.println("Cloudy");

		if(s.contentEquals("Cloudy")) System.out.println("Rainy");

		if(s.contentEquals("Rainy")) System.out.println("Sunny");
	}
}
