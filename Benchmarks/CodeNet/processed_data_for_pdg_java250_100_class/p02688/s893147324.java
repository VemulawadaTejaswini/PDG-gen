class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans[] = new int[N+1];
        int sum = 0;
        for(int i=0; i<K; i++) {
            int d = sc.nextInt();
            int[] A = new int[d];
            for(int j=0;j<d; j++) {
                A[j] = sc.nextInt();
                ans[A[j]]++;
            }
        }
        for(int i=1;i<N+1;i++) {
            if(ans[i] == 0) sum++;
        }
        System.out.println(sum);
	}
}
