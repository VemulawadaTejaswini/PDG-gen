public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String[] matrixStr = input.readLine().split(" ");
		int row = Integer.parseInt(matrixStr[0]);
		int rowCol = Integer.parseInt(matrixStr[1]);
		int column = Integer.parseInt(matrixStr[2]);
		int[][] matrixA = new int[row][rowCol];
		int[][] matrixB = new int[rowCol][column];
		long[][] matrixC = new long [row][column];
		for(int rowNum = 0; rowNum < row; rowNum++)
		{
			String[] rowStr = input.readLine().split(" ");
			for(int rowColNum = 0; rowColNum < rowCol; rowColNum++)
			{
				matrixA[rowNum][rowColNum] = Integer.parseInt(rowStr[rowColNum]);
			}
		}
		for(int rowColNum = 0; rowColNum < rowCol; rowColNum++)
		{
			String[] rowStr = input.readLine().split(" ");
			for(int columnNum = 0; columnNum < column; columnNum++)
			{
				matrixB[rowColNum][columnNum] = Integer.parseInt(rowStr[columnNum]);
			}
		}
		for(int rowNum = 0; rowNum < row; rowNum++)
		{
			for(int columnNum = 0; columnNum < column; columnNum++)
			{
				long sum = 0;
				for(int rowColNum = 0; rowColNum < rowCol; rowColNum++)
				{
					sum = sum + matrixA[rowNum][rowColNum] * matrixB[rowColNum][columnNum];
				}
				matrixC[rowNum][columnNum] = sum;
			}
		}
		for(int rowNum = 0; rowNum < row; rowNum++)
		{
			for(int columnNum = 0; columnNum < column; columnNum++)
			{
				System.out.print(matrixC[rowNum][columnNum]);
				if(columnNum != column - 1)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
