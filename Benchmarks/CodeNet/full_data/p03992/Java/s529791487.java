import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner dd = new Scanner(System.in);
		String firstPart = dd.next().substring(0, 4);
		String secondPart = dd.next().substring(4, 12);
		System.out.println(firstPart + " " + secondPart);
	}

}
