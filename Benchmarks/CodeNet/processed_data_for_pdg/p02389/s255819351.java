public class Main {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int side = scanner.nextInt();
		System.out.println(length * side + " " + ((length * 2) + (side * 2)));
	}
}
