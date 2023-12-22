package atCoder;

import java.util.Scanner;

public class A_AtCoderCrackers {
	//N枚のせんべいをK人に均等に配ったときに一番多くもらえる人と少ない人との枚数の差

	public static void main(String[] args) {

		int N; //せんべいの枚数
		int K; //人数
		int diff; //差分

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		K = scan.nextInt();

		if ( N % K == 0 ) {
			diff = 0;
		}else {
			diff = 1;
		}

		System.out.println(diff);

		scan.close();

	}

}
