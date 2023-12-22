import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hp = sc.nextInt();
		System.out.println(at(hp));
	}

	static int at(int hp) {
		if(hp==1) return 1;
		else return at(hp/2);
	}
}