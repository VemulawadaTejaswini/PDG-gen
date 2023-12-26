public class Main{
	public static void main(String[] args) {
		int intVector = 0;
		String strLineAll = "";
		int intColumnSum = 0;
		int intSum = 0;
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strLine1 = insBR.readLine();
			String[] strAryLine1 = strLine1.split(" ");
			int intLine = Integer.parseInt(strAryLine1[0]);
			int intColumn = Integer.parseInt(strAryLine1[1]);
			int[][] intTable = new int[intLine + 1][intColumn + 1];
			for(int i = 0; i < intLine; i++) {
				strLineAll = insBR.readLine();
				String[] strAryLine = strLineAll.split(" ");
				for(int j = 0; j < intColumn; j++) {
					intVector = Integer.parseInt(strAryLine[j]);
					intTable[i][j] = intVector;
					intColumnSum += intVector;
					intTable[intLine][j] += intVector;
					intSum += intVector;
				}
				intTable[i][intColumn] = intColumnSum;
				intColumnSum = 0;
			}
			intTable[intLine][intColumn] = intSum;
			for(int i = 0; i <= intLine; i++) {
				for(int j = 0; j <= intColumn; j++) {
					if(j == 0) {
						System.out.print(intTable[i][j]);
					}else {
						System.out.print(" " + intTable[i][j]);
					}
				}
				System.out.println("");
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
