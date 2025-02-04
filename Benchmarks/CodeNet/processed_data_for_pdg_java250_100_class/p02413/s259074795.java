public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int numlist[][] = new int[r + 1][c + 1];
		for (int cnt_r = 0; cnt_r < r + 1; cnt_r++){
			for (int cnt_c = 0; cnt_c < c + 1 ; cnt_c++) {
				numlist[cnt_r][c] += 0;
				numlist[r][cnt_c] += 0;
			}
		}
		for (int cnt_r = 0; cnt_r < r; cnt_r++){
			for (int cnt_c = 0; cnt_c < c ; cnt_c++) {
				numlist[cnt_r][cnt_c] = scan.nextInt();
				numlist[cnt_r][c] += numlist[cnt_r][cnt_c];
				numlist[r][cnt_c] += numlist[cnt_r][cnt_c];
				numlist[r][c] += numlist[cnt_r][cnt_c];
			}
		}
		for (int cnt_r = 0; cnt_r < r + 1; cnt_r++){
			for (int cnt_c = 0; cnt_c < c + 1 ; cnt_c++) {
				System.out.print( numlist[cnt_r][cnt_c]);
				if(cnt_c != c)
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		scan.close();
	}
}
