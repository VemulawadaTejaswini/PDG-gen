public class Main{
	public static void main(String[] args) {
		double dbAverage = 0.0;
		double dbStandarddeviatio = 0.0;
		ArrayList<Double> dbAryAnswer = new ArrayList<Double>();
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String strLine = insBR.readLine();
				int intNum = Integer.parseInt(strLine);
				if (intNum == 0) {
					break;
				}
				strLine = insBR.readLine();
				String[] strAryLine = strLine.split(" ");
				int[] intLine = new int[strAryLine.length];
				for (int i = 0; i < strAryLine.length; i++) {
					intLine[i] = Integer.parseInt(strAryLine[i]);
					dbAverage += intLine[i];
				}
				dbAverage = dbAverage / strAryLine.length;
				for (int i = 0; i < strAryLine.length; i++) {
					dbStandarddeviatio += (intLine[i] - dbAverage) * (intLine[i] - dbAverage);
				}
				dbStandarddeviatio /= strAryLine.length;
				dbStandarddeviatio = Math.sqrt(dbStandarddeviatio);
				dbAryAnswer.add(dbStandarddeviatio);
				dbAverage = 0.0;
				dbStandarddeviatio =0.0;
			}
			int intSize = dbAryAnswer.size();
			for (int i = 0; i < intSize; i++) {
				System.out.println(dbAryAnswer.get(i));
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
