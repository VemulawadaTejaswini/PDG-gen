public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] string = line.split(" ");
		int a = Integer.parseInt(string[0]);
		int b = Integer.parseInt(string[1]);
		int S = a * b;
		int L = 2 * (a + b);
		System.out.println(S + " " + L);
	}
}
