public class Main{
	public static void main(String[] args) {
				int intVector = 0;
				String strLineAll = "";
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strLine1 = insBR.readLine();
			String[] strAryLine1 = strLine1.split(" ");
			int intN = Integer.parseInt(strAryLine1[0]);
			int intM = Integer.parseInt(strAryLine1[1]);
			int intL = Integer.parseInt(strAryLine1[2]);
			int[][] intTableA = new int[intN][intM];
			int[][] intTableB = new int[intM][intL];
			double[][] dbTableC = new double[intN][intL];
			for(int i = 0; i < intN; i++) {
				strLineAll = insBR.readLine();
				String[] strAryLineAll = strLineAll.split(" ");
				for(int j = 0; j < intM; j++) {
					intVector = Integer.parseInt(strAryLineAll[j]);
					intTableA[i][j] = intVector;
				}
			}
			for(int i = 0; i < intM; i++) {
				strLineAll = insBR.readLine();
				String[] strAryLineAll = strLineAll.split(" ");
				for(int j = 0; j < intL; j++) {
					intVector = Integer.parseInt(strAryLineAll[j]);
					intTableB[i][j] = intVector;
				}
			}
			for(int i = 0; i < intN; i++) {
				for(int j = 0; j < intL; j++) {
					for(int k = 0; k < intM; k++) {
						dbTableC[i][j] += intTableA[i][k] * intTableB[k][j];
					}
				}
			}
		    DecimalFormat insdf = new DecimalFormat("0");
			for(int i = 0; i < intN; i++) {
				for(int j = 0; j < intL; j++) {
					if(j != 0) {
						System.out.print(" ");
					}
				System.out.print(insdf.format(dbTableC[i][j]));
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
