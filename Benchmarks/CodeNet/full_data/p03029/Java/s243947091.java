import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		int ans = (int) Math.ceil((a * 3 + p) / 2);
		System.out.println(ans);

	}

}
