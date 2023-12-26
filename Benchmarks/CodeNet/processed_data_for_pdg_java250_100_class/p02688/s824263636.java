public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N+1];
		for(int i = 0;i<K;i++) {
			int d = sc.nextInt();
			for(int j = 0;j<d;j++) {
				int sunuke = sc.nextInt();
				A[sunuke] = 1;
			}
		}
		int no_snack = N;
		for(int i = 1;i<=N;i++) {
			if(A[i] == 1)
				no_snack--;
		}
		System.out.println(no_snack);
    }
}
