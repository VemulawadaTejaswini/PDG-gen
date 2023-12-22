import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				int a[] = new int[n + 1];//添え字で１～ｎまでにしているので、１つ要素を多く持たせる
				int b[] = new int[n + 1];
				int cnt = 0;

				//pos以降はa[i]をb[i]にコピーすればよい（pos以降のiの倍数は１つしか存在しないため、a[i]の値と一致する）
				int pos = n / 2 + n % 2;
				for (int i = 1; i <= n; i++) {
					a[i] = sc.nextInt();
					
					if (i > pos ) {
						b[i] = a[i];
						if(a[i]==1)cnt++;
					}
				}
				for (int i = pos; i >= 1; i--) {
					int ballCnt = 0;
					for (int j = i; j <= n; j += i)ballCnt += b[j];
					if (ballCnt % 2 != a[i]) {
						b[i] = 1;
						cnt++;
					}
				}
				for (int i = 1; i <= n; i++) {
					if (b[i] == 1)System.out.println(i);
				}
    }
}