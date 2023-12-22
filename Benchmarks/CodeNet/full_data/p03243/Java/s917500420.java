import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		System.out.println(((n + 110) / 111) * 111);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
