import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ans = a <= 5 ? 0 : a <= 12 ? b / 2 : b;
		System.out.println(ans);

	}

}
