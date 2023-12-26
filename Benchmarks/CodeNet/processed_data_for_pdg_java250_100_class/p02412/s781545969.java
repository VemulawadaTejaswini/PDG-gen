public class Main{
	public static void main(String[] args) {
		ArrayList<Integer> intAryAnswer = new ArrayList<Integer>();
		int intAnswerCount = 0;
		try {
			BufferedReader insBR = new BufferedReader(
					new InputStreamReader(System.in));
			int intThird = 0;
			int intAnswer = 0;
			while (true) {
				String strLine = insBR.readLine();
				if(strLine.equals("0 0")) {
					break;
				}
				String[] strAryLine = strLine.split(" ");
				int intN = Integer.parseInt(strAryLine[0]);
				int intX = Integer.parseInt(strAryLine[1]);
				for(int i = intN; i > 0 ; i--) {
					for(int j = i - 1; j > 0; j--) {
						intThird = intX - i - j;
						if(intThird <= intN &&
								intThird != i &&
								intThird != j &&
								0 < intThird &&
								intThird < j
								) {
							intAnswer++;
						}
					}
				}
				intAryAnswer.add(intAnswer);
				intAnswer = 0;
				intAnswerCount++;
			}
			for(int i = 0; i < intAnswerCount; i++) {
				System.out.println(intAryAnswer.get(i));
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
