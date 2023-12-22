import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputa = sc.nextInt();
		int inputb = sc.nextInt();
		int inputc = sc.nextInt();

		int space = inputa;
		inputa = inputb;
		inputb = space;

		space = inputa;
		inputa = inputc;
		inputc = space;

		System.out.println(inputa + " " + inputb + " " + inputc);
	}
}