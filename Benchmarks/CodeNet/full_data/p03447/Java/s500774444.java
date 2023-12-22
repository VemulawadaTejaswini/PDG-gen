import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int shojikin = sc.nextInt();
		int cake = sc.nextInt();
		int donuts = sc.nextInt();
		shojikin = shojikin - cake;
		int amari = shojikin%donuts;
		System.out.println(amari);
	}
}