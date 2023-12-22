public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int count = 0;

		for (int a=1;a<=N;a++) {
			int ax = a%K;
			int bs = K - ax;
			for (int b=bs;b<=N;b+=K) {
				int bx = b%K;
				int cs1 = K - bx;
				for (int c=cs1;c<=N;c+=K) {
					if ((a+c)%K==0){
						count ++;
					}
				}
			}
		}

		System.out.println(count);

	}

}