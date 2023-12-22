public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner in = new Scanner(System.in);
		final int a = in.nextInt(), b = in.nextInt();
		System.out.println((100 ^ a) * b);
	}

}