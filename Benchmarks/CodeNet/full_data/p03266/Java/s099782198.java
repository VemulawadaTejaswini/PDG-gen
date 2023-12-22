
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int s = N / K;
		long count = 0;
		if (K/2 <= N) { 
			if (K%2==1) {
				count = (long)s*(long)s*(long)s;
			} else {
				if (N%K==0) {
					count = (long)s*(long)s*(long)s*(long)2;
				} else {
					count = (long)s*(long)s*(long)s + (long)(s+1)*(long)(s+1)*(long)(s+1);
				}
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