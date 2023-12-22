import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int count = 0;
		if(a != b) {
			count = 2*(Math.max(a, b))-1;
		}else {
			count = a + b;
		}
		System.out.println(count);
	}
}