class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int n = Integer.parseInt(s1);
		String s2 = sc.next();
		int m = Integer.parseInt(s2);
		int A[][] = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				String s3 = sc.next();
				int a = Integer.parseInt(s3);
				A[i][j] = a;
			}
		}
		int b[] = new int[m];
		for(int i = 0; i < m; i++){
			String s4 = sc.next();
			int b1 = Integer.parseInt(s4);
			b[i] = b1;
		}
		int c[] = new int[n];
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < m; j++){
				sum += A[i][j] * b[j];
			}
			c[i] = sum;
			System.out.println(c[i]);
		}
	}
}
