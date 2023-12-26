public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,sum;
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a + b;
			System.out.println(Integer.toString(sum).length());
		}
	}
}
