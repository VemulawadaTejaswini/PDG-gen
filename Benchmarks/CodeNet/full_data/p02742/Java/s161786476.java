import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		double h=sc.nextLong(),w=sc.nextLong();
		System.out.println((long)((Math.ceil(h/2)*w)));
	}
}
