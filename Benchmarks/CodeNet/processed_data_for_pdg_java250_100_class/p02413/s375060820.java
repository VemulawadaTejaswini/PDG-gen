public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intSumNum = 0;
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] ary = new int[r+1][c+1];
		for(int i =0; i < r ; i++){
			for(int j = 0; j < c; j++ ){
				ary[i][j] = scan.nextInt();
			}
		}
		for(int k = 0; k < r + 1; k++){
			for(int l = 0; l < c + 1; l++){
				if(l != c && k != r){
					ary[k][c] += ary[k][l];
				}
				if(k != r){
					ary[r][l] += ary[k][l];
				}
				System.out.print(ary[k][l]);
				if(l != c){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
