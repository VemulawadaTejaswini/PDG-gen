import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxw = sc.nextInt();

		int[] ws = new int[N];
		int[] ps = new int[N];

		for (int i = 0; i < N; i++) {
			ws[i] = sc.nextInt();
			ps[i] = sc.nextInt();
		}

		int[] src = new int[maxw + 1];    //dp[][] の代わり
		int[] dst = new int[maxw + 1];    //dp[][] の代わり
		int[] tmp;    //スワップ用

		for (int i = 0; i < ws.length; i++) {
		    for (int j = 1; j <= maxw; j++) {
		        if (j < ws[i]) {
		            dst[j] = src[j];
		        } else {
		            dst[j] = Math.max(src[j], src[j - ws[i]] + ps[i]);
		        }
		    }
		    //参照をスワップ(C言語系ならポインタをスワップ)
		    tmp = src;
		    src = dst;
		    dst = tmp;
		}

		System.out.println(src[maxw]);
	}

}