public class Main {
	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String answer = "NO";
		if (num1 >= num2 * 2 - 1) {
			answer = "YES";
		}
		System.out.println(answer);
	}
}
