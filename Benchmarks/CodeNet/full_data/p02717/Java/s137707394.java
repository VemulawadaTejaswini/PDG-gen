import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			System.out.println(Z + " " + X + " " + Y);

		} finally

		{
			sc.close();
		}
	}

}
