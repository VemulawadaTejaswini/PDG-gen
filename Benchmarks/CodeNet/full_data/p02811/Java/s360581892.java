import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	if(500 * sc.nextInt() >= sc.nextInt() ) {
		System.out.print("Yes");
	}
	else {
		System.out.print("No");
	}
	sc.close();
  }
}
