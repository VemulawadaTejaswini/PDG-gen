public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowNum = sc.nextInt();
		int colNum = sc.nextInt();
		int sheet[][] = new int[rowNum][colNum];
		for(int i=0; i<rowNum; i++) {
			for(int j=0; j<colNum; j++) {
				sheet[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int colSum[] = new int[colNum];
		for(int i=0; i<rowNum; i++) {
			int rowSum = 0;
			for(int j=0; j<colNum+1; j++) {
				if(j == colNum) {
					System.out.print(rowSum);
				} else {
					rowSum += sheet[i][j];
					colSum[j] += sheet[i][j];
					System.out.print(sheet[i][j] + " ");
				}
			}
			System.out.println("");
		}
		int totalSum = 0;
		for(int i=0; i<colNum; i++) {
			totalSum += colSum[i];
			System.out.print(colSum[i] + " ");
		}
		System.out.println(totalSum);
	}
}
