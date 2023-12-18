public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(),b = in.nextInt();
		in.close();
		int area = a*b,zc = 2*(a+b);
		System.out.print(area + " " + zc);
		System.out.println();
	}
}
