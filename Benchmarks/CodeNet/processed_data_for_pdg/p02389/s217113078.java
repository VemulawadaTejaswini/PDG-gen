public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		System.out.print(a * b);
		System.out.print(" ");
		System.out.println((a + b) * 2);
	}
}
