import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int l = sc.nextInt();
		 double length = l/3;
		System.out.println(length*length*length);
		sc.close();
	}
}