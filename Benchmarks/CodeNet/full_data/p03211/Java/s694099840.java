import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final String str = sc.next();
		int m = 753;
		for (int i=0; i< str.length()-2; i++) {
			int num = Integer.parseInt(str.substring(i, i+3));
			m = Math.min(m, Math.abs(753-num));
		}
		System.out.println(m);
		sc.close();
	}

}
