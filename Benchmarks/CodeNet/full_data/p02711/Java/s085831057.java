import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String stringN = Integer.toString(N);
		if(stringN.contains("7")) {
			System.out.println("Yes");
			}
		else if(!stringN.contains("7")) {
			System.out.println("No");
		}

}
}
