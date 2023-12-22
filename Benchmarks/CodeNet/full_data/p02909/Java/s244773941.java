import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String weather = scan.next();
		String re = "";

		switch (weather) {
		case "Sunny":
			re = "Cloudy";
		case "Cloudy":
			re = "Rainy";
		case "Rainy":
			re = "Sunny";
		}
		System.out.println(re);
		scan.close();

	}

}
