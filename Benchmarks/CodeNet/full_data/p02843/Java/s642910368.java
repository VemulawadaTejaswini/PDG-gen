import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int remain = x % 100;
		int num = x / 100;
		boolean isAble = remain < num * 5;
		System.out.println(isAble ? 1 : 0);
	}

}