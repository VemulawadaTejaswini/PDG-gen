public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int sum = 0;
		int min = 1001;
		int[] m = new int[N];
		for(int i = 0; i < N; i++){
			m[i] = sc.nextInt();
			sum += m[i];
			if(m[i] < min) min = m[i];
		}
		System.out.println((X - sum) / min + N);
	}
}
