import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int H = scanner.nextInt();
		int N = scanner.nextInt();
		
		//決まった回数繰り返す
		for (int i = 0; i < N; i++) {
          
			int A = scanner.nextInt();
			H -= A;
		}
      	
		String ans = H <= 0 ? "Yes" : "No";
		System.out.println(ans);


		scanner.close();
	}
}
