import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int r = stdIn.nextInt();
		int g = stdIn.nextInt();
		int b = stdIn.nextInt();
		if((r*100+g*10+b)%4 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}