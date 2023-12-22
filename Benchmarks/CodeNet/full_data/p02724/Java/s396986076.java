import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);

		int X = n.nextInt();

		int fiveHundred = X / 500;
		int happy = fiveHundred * 1000;
		X  = X - (fiveHundred * 500);

		int five = X / 5;
		happy = happy + (five * 5);

		System.out.println(happy);
	}

}
