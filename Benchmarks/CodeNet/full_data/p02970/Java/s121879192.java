import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void a() {
		int r = sc.nextInt();
		System.out.println(3 * r  * r);
	}
	
	void b() {
		int n = sc.nextInt(),d = sc.nextInt();
		int range = d * 2 + 1;
		if(n % range == 0) System.out.println(n / range);
		else System.out.println(n / range + 1);
	}

	public static void main(String[] args) {
		new Main().b();
	}

}
