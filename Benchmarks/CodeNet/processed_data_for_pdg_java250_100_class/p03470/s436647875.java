public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int d[] = new int[N];
		for(int i = 0;i < N;i++) {
			d[i] = sc.nextInt();
		}
		int max;
		for(int i = 0;i < N;i++) {
			for(int j = i;j < N;j++) {
				if(d[i] < d[j]) {
					max = d[i];
					d[i] = d[j];
					d[j] = max;
				}
			}
		}
		int count = 1;
		int mochi = d[0];
		for(int i = 1;i < N;i++) {
			if(mochi > d[i]) {
				mochi = d[i];
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
