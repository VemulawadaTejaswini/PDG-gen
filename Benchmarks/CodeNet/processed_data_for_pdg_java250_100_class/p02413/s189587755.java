class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int r = Integer.parseInt(s1);
		String s2 = sc.next();
		int c = Integer.parseInt(s2);
		int a[][] = new int[r][c];
		if(1 <= r && r <= 100){
			if(1 <= c && c <= 100){
				for(int i = 0; i < r; i++ ){
					for(int j = 0; j < c; j++){
						String s3 = sc.next();
						int k = Integer.parseInt(s3);
						a[i][j] = k;
					}
				}
				int total = 0;
				for(int i = 0; i < r; i++ ){
					int sum = 0;
					for(int j = 0; j < c; j++){
						System.out.print(a[i][j] + " ");
						sum += a[i][j];
					}
					total += sum;
					System.out.println( sum );
				}
				for(int j = 0; j < c; j++ ){
					int sum = 0;
					for(int i = 0; i < r; i++){
						sum += a[i][j];
					}
					System.out.print( sum + " ");
				}
				System.out.println( total );
			}
		}
	}
}
