public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] aAry = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				aAry[i][j] = scan.nextInt();
			}
		}
		int[] bAry = new int[m];
		for(int i = 0; i < m; i++ ){
			bAry[i] = scan.nextInt();
		}
		scan.close();
		int intAnswer = 0;
		for(int i =0; i < n; i++){
			int intResult = 0;
			for(int j = 0; j < m; j++){
				intResult = intResult + intAnswer;
			}
			System.out.println(intResult);
		}
	}
}
