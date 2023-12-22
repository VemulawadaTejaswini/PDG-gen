public class Main{
	public static void main(String[] args) {
		ArrayList<String> StringAry = new ArrayList<String>();
		String StrFromChar = "";
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			int[] intAnswer = new int[2];
				String strLine = insBR.readLine();
				int intNum = Integer.parseInt(strLine);
				String[][] strAnimal = new String[2][intNum];
				for (int i = 0; i < intNum; i++) {
					strLine = insBR.readLine();
					String[] strLineAry = strLine.split(" ");
					strAnimal[0][i] = strLineAry[0];
					strAnimal[1][i] = strLineAry[1];
					if (strAnimal[0][i].compareToIgnoreCase(strAnimal[1][i]) == 0) {
						intAnswer[0]++;
						intAnswer[1]++;
					}else if(strAnimal[0][i].compareToIgnoreCase(strAnimal[1][i]) < 0) {
						intAnswer[1] += 3;
					}else if(strAnimal[0][i].compareToIgnoreCase(strAnimal[1][i]) > 0) {
						intAnswer[0] += 3;
					}
				}
			for (int i = 0; i < intAnswer.length; i++) {
				if(i == 0) {
					System.out.print(intAnswer[i]);
				}else {
					System.out.print(" " + intAnswer[i]);
				}
			}
			System.out.println("");
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
