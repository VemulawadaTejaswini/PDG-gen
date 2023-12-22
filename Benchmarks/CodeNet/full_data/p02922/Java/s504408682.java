import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);
			int ans = 0;

			int A = sc.nextInt();
			int B = sc.nextInt();

			while((A-1)*(ans-1)+A < B) {
				ans++;
			}

			System.out.println(ans);

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}
    }