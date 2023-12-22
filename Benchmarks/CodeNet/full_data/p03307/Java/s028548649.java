import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N % 2 == 0)System.out.println(N);
		else System.out.println(2 * N);
		}

}
