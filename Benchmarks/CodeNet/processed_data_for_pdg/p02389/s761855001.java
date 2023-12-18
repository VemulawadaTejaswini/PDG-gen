public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int height = number.nextInt();
		int width = number.nextInt();
		System.out.println(height * width + " " + (height + width) * 2);
	}
}
