public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		int v2 = v;
		v2 *= v * v;
		System.out.println(v2);
	}
}
