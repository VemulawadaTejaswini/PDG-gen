import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

/*
		int cnt = 0;
		for (int a=1;a<=N;a++) {
			for (int b=1;b<=N;b++) {
				for (int c=1;c<=N;c++) {
					if ((a+b)%K==0){
						if ((a+c)%K==0){
							if ((b+c)%K==0){
								System.out.print(a);
								System.out.print(" ");
								System.out.print(b);
								System.out.print(" ");
								System.out.println(c);
								cnt++;
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);
*/

		int d = N / K;
		int d2 = N / (K + K / 2);
		int m = N % K;
		long count = 0;
		if (K/2 <= N) {
			if (K%2==1) {
				count = (long)d*(long)d*(long)d;
			} else {
				if (m==0) {
					count = (long)d*(long)d*(long)d*(long)2;
				} else {
					if (d2 > 0) {
						count = (long)d*(long)d*(long)d
								+ (long)(d+1)*(long)(d+1)*(long)(d+1);
					}
					else {
						count = 2;
					}

				}
			}
		}




		System.out.println(count);

	}