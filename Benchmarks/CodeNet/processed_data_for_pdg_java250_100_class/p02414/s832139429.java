public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int retu_a[][] = new int[n][m];
		int retu_b[][] = new int[m][l];
		long retu_c[][] = new long[n][l];
		for (int cnt_n = 0; cnt_n < n; cnt_n++){
			for (int cnt_m = 0; cnt_m < m; cnt_m++) {
				retu_a[cnt_n][cnt_m] = scan.nextInt();
			}
		}
		for (int cnt_m = 0; cnt_m < m; cnt_m++){
			for (int cnt_l = 0; cnt_l < l; cnt_l++) {
				retu_b[cnt_m][cnt_l] = scan.nextInt();
			}
		}
		for (int cnt_n = 0; cnt_n < n; cnt_n++){
			for (int cnt_l = 0; cnt_l < l; cnt_l++){
				for (int cnt_m = 0; cnt_m < m; cnt_m++) {
					retu_c[cnt_n][cnt_l] += retu_a[cnt_n][cnt_m] * retu_b[cnt_m][cnt_l];
				}
				System.out.print(retu_c[cnt_n][cnt_l]);
				if(cnt_l != l - 1)
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		scan.close();
	}
}
