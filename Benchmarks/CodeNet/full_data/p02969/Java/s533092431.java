import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void a() {
		int r = sc.nextInt();
		System.out.println(3 * r  * r);
	}

	public static void main(String[] args) {
		new Main().a();
	}

}
