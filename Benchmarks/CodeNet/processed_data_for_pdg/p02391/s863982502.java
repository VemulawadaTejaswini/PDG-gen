public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] strings = line.split(" ");
		int a = Integer.parseInt(strings[0]);
		int b = Integer.parseInt(strings[1]);
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else if (a == b) {
			System.out.println("a == b");
		}
	}
}
