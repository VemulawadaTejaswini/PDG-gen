public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ab = sc.nextLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		int mennseki = a * b;
		int shuu = 2*a + 2*b;
		System.out.println(mennseki + " " + shuu);
	}
}
