import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int i = 1;
		int flag = 0;

		//Aの倍数をBで割った余りを求める
		loop: while (flag == 0) {
			int tmp_rest = A * i % B;
			//もしAの倍数をBで割った余りがCと等しければ、flagをYES用の1にして処理を終了
			if (tmp_rest == C) {
				flag = 1;
				break loop;
			}

			//もしAの倍数をBで割った余りがCと等しくなければ、

			else {
				int j = 1;
				while(j<i) {
					//A * i までの余りを算出して、今回の余りと合致するか調べる
					int tmp_rest2 = A * j % B;
					if (tmp_rest == tmp_rest2) {
						flag = -1;
						break loop;
					}
					else {
						flag = 0;
					}
				}
			}
			//もし重複がなければ、次の処理に移行する
			i++;
		}

		if (flag > 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}
}
