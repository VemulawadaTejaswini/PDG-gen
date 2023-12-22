import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO ABC_087_B
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		int ret = 0;
		int sumA = 0, sumB = 0, sumC = 0;
		int maiA = 0, maiB = 0, maiC = 0;

		for(maiA = 0; maiA <= A; maiA++) {
			if(maiA * 500 > X) {
				break;
			}
			sumA = maiA * 500;

			for(maiB = 0; maiB <= B; maiB++) {
				if(maiB * 100 + sumA > X) {
					break;
				}
				sumB = maiB * 100 + sumA;

				for(maiC = 0; maiC <= C; maiC++) {
					if(maiC * 50 + sumB > X) {
						break;
					}
					sumC = maiC * 50 + sumB;
					if(sumC == X) {
						ret++;
						break;
					}
				}
			}
		}

		// 出力
		System.out.println(ret);

	}
}
