public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int area = a * b;
		int s = a * 2 + b * 2;
		System.out.println(area+" "+s);
	}
}
