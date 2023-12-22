import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //宿泊数
		int K = sc.nextInt();  //宿泊数K
		int X = sc.nextInt();  //割引前価格
		int Y = sc.nextInt();  //割引後価格
		
		System.out.println((K * X) + ((N - K) * Y));
		

	}

}