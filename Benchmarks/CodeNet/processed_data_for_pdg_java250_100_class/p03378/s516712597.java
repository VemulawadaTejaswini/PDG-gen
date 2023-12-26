public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int sum_l = 0;
		int sum_r = 0;
		for(int i = 0; i < M; i++){
			int A = sc.nextInt();
			if(A < X) sum_l++;
			else sum_r++;
		}
		System.out.println(Math.min(sum_l, sum_r));
	}
}
