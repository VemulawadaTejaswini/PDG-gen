public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		scanner.close();
		int answer = i * i * i;
		System.out.println(answer);
	}
}
