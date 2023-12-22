
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);

			int n = scanner.nextInt();

			long[] a = new long[n+1];
			for (int i = 0; i < a.length; i++) {
				a[i] = scanner.nextInt();
			}

			long[] b = new long[n];
			for (int i = 0; i < b.length; i++) {
				b[i] = scanner.nextInt();
			}

			Main citySavers = new Main();
			System.out.println(citySavers.citySavers(a, b));

			scanner.close();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}
	}


	public long citySavers(long[] a, long[] b) {
		long count = 0;

		for (int i = 0; i < b.length; i++) {
			if (a[i] >= b[i]) {					//1つ目の街の敵>倒せる数
				count = count + b[i];
			}else if (a[i+1] >= b[i] - a[i]){	//1つ目の街の敵+2つ目の街の敵>倒せる数
				count = count + b[i];
				a[i+1] = a[i+1] + a[i] - b[i];
			}else {								//1つ目の街の敵+2つ目の街の敵<倒せる数
				count = count + a[i] + a[i+1];
				a[i+1] = 0;
			}
		}

		return count;
	}

}

