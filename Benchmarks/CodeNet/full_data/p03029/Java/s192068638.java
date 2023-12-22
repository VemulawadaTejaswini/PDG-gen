import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		int b = a * 3;
		double c = b + p;

		double d = c / 2;
		double e=Math.floor(d);
		int f=(int)e;
		System.out.println(f);
	}
}
