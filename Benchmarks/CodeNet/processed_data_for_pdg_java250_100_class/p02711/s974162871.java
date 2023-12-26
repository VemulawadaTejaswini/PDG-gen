public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		if (n.contains("7")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		kb.close();
	}
}
