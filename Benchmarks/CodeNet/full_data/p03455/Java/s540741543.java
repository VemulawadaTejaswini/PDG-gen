import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int a;
	int b;
	public void run() {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if((a*b)%2 == 0) System.out.println("Even");
		else System.out.println("Odd");
		sc.close();
	}
}