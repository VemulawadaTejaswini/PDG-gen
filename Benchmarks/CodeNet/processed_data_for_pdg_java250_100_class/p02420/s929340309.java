public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			String inputData = scn.next();
			if (inputData.equals("-")) {
				break;
			}
			int count = scn.nextInt();
			int shuffleCount;
			for (int i = 0; i < count; i++) {
				shuffleCount = scn.nextInt();
				inputData = inputData.substring(shuffleCount) + inputData.substring(0, shuffleCount);
			}
			System.out.println(inputData);
		}
	}
}
