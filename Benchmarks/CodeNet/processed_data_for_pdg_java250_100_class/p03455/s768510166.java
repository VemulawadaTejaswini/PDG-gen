public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputText1 = scanner.nextInt();
		int inputText2 = scanner.nextInt();
		int result = inputText1 * inputText2;
		if(result%2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		scanner.close();
	}
}
