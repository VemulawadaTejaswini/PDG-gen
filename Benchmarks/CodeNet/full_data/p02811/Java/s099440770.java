import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		print(k * 500 >= x ? "Yes" : "No");
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}
}