import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();
		if(A + B >= C) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}