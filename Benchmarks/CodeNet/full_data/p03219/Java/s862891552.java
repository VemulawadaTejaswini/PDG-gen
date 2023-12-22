import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ex1();
		//ex2();
	}

	public static void ex1() {
		int X=0;
		int Y=0;

		Scanner sc = new Scanner(System.in);
		 X = sc.nextInt();
         Y = sc.nextInt();

        System.out.println(X+Y/2);
	}
}