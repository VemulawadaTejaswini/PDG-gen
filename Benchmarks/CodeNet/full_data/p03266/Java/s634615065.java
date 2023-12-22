import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int s = N / K;
		int count = 0;
		if (K%2==1) {
			count = s*s*s;
		} else {
			if (N%K==0) {
				count = s*s*s*2;
			} else {
				count = s*s*s + (s+1)*(s+1)*(s+1);
			}


		}


		/*
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
							}
						//count ++;
						}
					}
				}
			}
		}
		*/


		System.out.println(count);

	}

}