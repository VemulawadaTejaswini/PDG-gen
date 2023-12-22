import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int s = sc.nextInt();
		if(i >= s) {
			System.out.println(i - s);
		} else {
			System.out.println(0);
		}
	}
}