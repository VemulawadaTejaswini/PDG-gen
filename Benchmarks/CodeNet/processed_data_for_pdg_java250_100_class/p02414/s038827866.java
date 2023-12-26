public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int columnRow = scan.nextInt();
		int column = scan.nextInt();
		int[][] matrixA = new int[row][columnRow];
		int[][] matrixB = new int[columnRow][column];
		long[][] matrixC = new long[row][column];
		for(int rowI = 0 ;rowI < row;rowI++){
			for(int columnRowI =0 ;columnRowI < columnRow ;columnRowI++){
				matrixA[rowI][columnRowI] = scan.nextInt();
			}
		}
		for(int columnRowI = 0 ;columnRowI < columnRow;columnRowI++){
			for(int columnI =0 ;columnI < column ;columnI++){
				matrixB[columnRowI][columnI] = scan.nextInt();
			}
		}
		for(int rowI = 0 ;rowI < row;rowI++){
			for(int columnRowI =0 ;columnRowI < column ;columnRowI++){
				for(int columnI =0 ;columnI < columnRow ;columnI++){
					matrixC[rowI][columnRowI]
							+= matrixA[rowI][columnI] * matrixB[columnI][columnRowI];
				}
			}
		}
		for(int rowI = 0 ;rowI < row;rowI++){
			for(int columnI = 0 ;columnI < column ;columnI++){
				if(columnI+ 1 == column){
					System.out.println(matrixC[rowI][columnI]);
				}else if(columnI < column){
					System.out.print(matrixC[rowI][columnI] + " ");
				}
			}
		}
		scan.close();
	}
}
