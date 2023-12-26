public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char a = s.nextLine().charAt(0);
		boolean b = Character.isUpperCase(a);
		if (b) {
			System.out.println("A");
		}
		else {
			System.out.println("a");
		}
	}
}
