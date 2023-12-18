public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sanjo = 1;
		for (int i = 0; i<3; i++) {
			sanjo = sanjo * num;
		}
		System.out.println(sanjo);
	}
}
