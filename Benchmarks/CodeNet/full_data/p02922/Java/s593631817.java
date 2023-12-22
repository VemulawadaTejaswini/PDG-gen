import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.nextLine().split(" ");
		double a = Integer.parseInt(temp[0]);
		double b = Integer.parseInt(temp[1]);

		int ans = (int) Math.ceil(b / a);

		System.out.println(ans);
	}

}
