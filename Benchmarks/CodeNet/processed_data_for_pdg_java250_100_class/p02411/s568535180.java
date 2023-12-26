public class Main{
	public static void main(String[] args) {
		ArrayList<Character> chaAnswer = new ArrayList<Character>();
		int intAnwer = 0;
		try {
			BufferedReader insBR = new BufferedReader(
					new InputStreamReader(System.in));
			while (true) {
				String strLine = insBR.readLine();
				if(strLine.equals("-1 -1 -1")) {
					break;
				}
				String[] strAryLine = strLine.split(" ");
				int IntermediateTest = Integer.parseInt(strAryLine[0]);
				int intYearEndTest = Integer.parseInt(strAryLine[1]);
				int intAdditionalTest = Integer.parseInt(strAryLine[2]);
				char chaAnswerStock = 'G';
				if(IntermediateTest == -1) {
					intYearEndTest = 0;
				}
				if(intYearEndTest == -1) {
					IntermediateTest = 0;
				}
				if (80 <= (IntermediateTest + intYearEndTest)) {
					chaAnswerStock = 'A';
				} else if (65 <= (IntermediateTest + intYearEndTest)) {
					chaAnswerStock = 'B';
				} else if (50 <= (IntermediateTest + intYearEndTest)) {
					chaAnswerStock = 'C';
				} else if (30 <= (IntermediateTest + intYearEndTest)) {
					chaAnswerStock = 'D';
					if (50 <= intAdditionalTest) {
						chaAnswerStock = 'C';
					}
				} else {
					chaAnswerStock = 'F';
				}
				chaAnswer.add(chaAnswerStock);
				intAnwer++;
			}
			for(int i = 0; i < intAnwer; i++) {
				System.out.println(chaAnswer.get(i));
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
