public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int[]   b = new int[m];
		int[]   c = new int[n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0; j < m ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int j = 0 ; j < m ; j++) {
			b[j] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0; j < m ; j++) {
				int A = a[i][j] ;   
				int B = b[j] ;      
				c[i] += A*B;        
			}
			System.out.println(c[i]);
		}
		sc.close();
	}
}
