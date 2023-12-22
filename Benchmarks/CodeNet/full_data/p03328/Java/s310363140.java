import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		int dif = b-a-1;
		int x = dif*(dif+1)/2 - a;
		System.out.println(x);
	}

}