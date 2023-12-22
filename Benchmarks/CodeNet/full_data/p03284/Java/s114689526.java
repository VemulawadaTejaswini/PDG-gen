import java.util.Scanner;

public class Main {// AtCoderは必ずMainクラスで提出する
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int amari = n%k;
		if(amari < 0)amari = amari * -1;
		System.out.println(amari);
	}
}