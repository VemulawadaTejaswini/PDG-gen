public class Main{
	public static void main(String[] args) {
		ArrayList<String> StringAry = new ArrayList<String>();
		String StrFromChar = "";
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String strLine = insBR.readLine();
				if (strLine.equals("-")) {
					break;
				}
				char[] chaAryLine1 = strLine.toCharArray();
				char[] charAfter = new char[chaAryLine1.length];
				strLine = insBR.readLine();
				int intNum2 = Integer.parseInt(strLine);
				for (int i = 0; i < intNum2; i++) {
					strLine = insBR.readLine();
					int intShuffle = Integer.parseInt(strLine);
					System.arraycopy(chaAryLine1, 0, charAfter,
							chaAryLine1.length - intShuffle, intShuffle);
					System.arraycopy(chaAryLine1, intShuffle, charAfter, 0,
							chaAryLine1.length - intShuffle);
					System.arraycopy(charAfter, 0, chaAryLine1, 0,
							charAfter.length);
				}
				StrFromChar = String.valueOf(charAfter);
				StringAry.add(StrFromChar);
			}
			int intSize = StringAry.size();
			for (int i = 0; i < intSize; i++) {
				System.out.println(StringAry.get(i));
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
