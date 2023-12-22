public class Main {
	public static void main(String[] args) {
		
		String[] inputData = args[0].split(" ", 0);
		int lcA = Integer.valueOf(inputData[0]);
		int lcB = Integer.valueOf(inputData[1]);
		int lcC = Integer.valueOf(inputData[2]);
		int lcD = Integer.valueOf(inputData[3]);
		
		boolean isTalkableBetWeenCAndA = Math.abs(lcA - lcC) <= lcD;
		boolean isTalkableBetWeenAAndB = Math.abs(lcB - lcA) <= lcD;
		boolean isTalkableBetWeenBAndC = Math.abs(lcB - lcC) <= lcD;;
		
		if (isTalkableBetWeenCAndA || (isTalkableBetWeenAAndB && isTalkableBetWeenBAndC) ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}