import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //トータル宿泊数
		int K = sc.nextInt();  //最初の宿泊数
		int X = sc.nextInt();  //割引前価格
		int Y = sc.nextInt();  //割引後価格
		
		System.out.println(N <= K ? K * X : (K * X) + ((N - K) * Y));
		

	}

}
