public class Main{
	public static void main(String[] args) {
		int intVector = 0;
		String strLine = "";
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strLine1 = insBR.readLine();
			String[] strAryLine1 = strLine1.split(" ");
			int intLine = Integer.parseInt(strAryLine1[0]);
			int intColumn = Integer.parseInt(strAryLine1[1]);
			int[][] intVectorA = new int[intLine][intColumn];
			int[] intColumnB = new int[intColumn];
			int[] intAnswer = new int[intLine];
			for(int i = 0; i < intLine; i++) {
				strLine = insBR.readLine();
				String[] strAryLine = strLine.split(" ");
				for(int j = 0; j < intColumn; j++) {
					intVector = Integer.parseInt(strAryLine[j]);
					intVectorA[i][j] = intVector;
				}
			}
			for(int i = 0; i < intColumn; i++) {
				strLine = insBR.readLine();
				intVector = Integer.parseInt(strLine);
				intColumnB[i] = intVector;
			}
			for(int i = 0; i < intLine; i++) {
				for(int j = 0; j < intColumn; j++) {
					intAnswer[i] += intVectorA[i][j] * intColumnB[j];
				}
				System.out.println(intAnswer[i]);
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
