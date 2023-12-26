public class Main {
	private static int a[];
	private static int N = 10;
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int max = i;
			for (int j = i+1; j < N; j++) {
				if(a[j] > a[max]) {
					max = j;
				}
			}
			int t = a[i];
			a[i] = a[max];
			a[max] = t;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
	}
}
