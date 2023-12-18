public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] string = line.split(" ");
		int a = Integer.parseInt(string[0]);
		int b = Integer.parseInt(string[1]);
		if (a > b) {
			System.out.println("a > b");
		}
		if (a < b) {
			System.out.println("a < b");
		}
		if (a == b) {
			System.out.println("a == b");
		}
	}
}
