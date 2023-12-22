import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int keta = 1;
		while (true){
			if (Math.pow(K, keta -1) <= N && (Math.pow(K, keta) -1) > N){
				System.out.println(keta);
				break;
			}
			keta ++;
		}

	}
}