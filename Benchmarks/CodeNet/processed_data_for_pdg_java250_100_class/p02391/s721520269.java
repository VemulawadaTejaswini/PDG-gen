public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		System.out.println("a " + ((a < b) ? "<" : (a > b) ? ">" : "==") + " b");
		scan.close();
	}
}
