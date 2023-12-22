public class Main {
	public static void main(String[] args) {
		args = new String[]{"3", "2"};

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String answer;
		if (num1 >= num2 * 2 - 1) {
			answer = "yes";
		}else{
			answer = "no";
		}
		System.out.println(answer);
	}
}
