public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a < 1 || b > 100) {
			throw new IllegalArgumentException("Input Number Error");
		}
		int area = a * b;
		int circumference = (a * 2) + (b * 2);
		System.out.println(area + " " + circumference);
	}
}
