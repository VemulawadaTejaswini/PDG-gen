import java.util.Scanner;


public class Main {
	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] dices = new int[n];

		for(int i = 0; i < n; i++) {
			dices[i] = sc.nextInt();
		}

		double resultMax = 0;
		double diceMax = 0;
		double tmpdiceMax = 0;
		int[] tmpdices = new int[k];
		for(int i = 0; i <= n - k; i++) {	//ダイス総数
			for (int j = 0; j < k; j++) {	//隣接するダイス数
				double dice = dices[i+j];
				for(int h = 0; h < dice; h++) {	//期待値計算
					double tmp = h + 1;
					tmpdiceMax +=  tmp / dice;
				}
				diceMax += tmpdiceMax;
				tmpdiceMax = 0.0d;
			}

			if(resultMax < diceMax) {
				resultMax = diceMax;
			}
			diceMax = 0;
		}


		System.out.println(resultMax);
	}
}