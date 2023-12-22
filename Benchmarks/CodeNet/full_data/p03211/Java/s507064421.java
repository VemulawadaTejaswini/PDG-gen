import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		StringBuilder sb = new StringBuilder();

		int ans = 1000;

		for(int i = 0; i < temp.length() - 2; i ++) {

			sb.append(String.valueOf(temp.charAt(i)));
			sb.append(String.valueOf(temp.charAt(i + 1)));
			sb.append(String.valueOf(temp.charAt(i + 2)));

			int tmp = Math.abs(753 - Integer.parseInt(sb.toString()));
			ans = Math.min(ans, tmp);
			sb.setLength(0);
		}
		System.out.println(ans);

	}

}
