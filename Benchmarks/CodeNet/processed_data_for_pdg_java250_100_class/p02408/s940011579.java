public class Main{
	public static void main(String[] args) {
		int[] intMarkS = new int[13];
		int[] intMarkH = new int[13];
		int[] intMarkC = new int[13];
		int[] intMarkD = new int[13];
		int intNum = 0;
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(
					System.in));
			int intFirstLine = Integer.parseInt(insBR.readLine());
			for (int i = 0; i < intFirstLine; i++) {
				String strLine = insBR.readLine();
				String[] strAry = strLine.split(" ");
				if (strAry[0].equals("S")) {
					intNum = Integer.parseInt(strAry[1]);
					intMarkS[intNum - 1] = 1;
				} else if (strAry[0].equals("H")) {
					intNum = Integer.parseInt(strAry[1]);
					intMarkH[intNum - 1] = 1;
				} else if (strAry[0].equals("C")) {
					intNum = Integer.parseInt(strAry[1]);
					intMarkC[intNum - 1] = 1;
				} else if (strAry[0].equals("D")) {
					intNum = Integer.parseInt(strAry[1]);
					intMarkD[intNum - 1] = 1;
				}
			}
			for (int i = 0; i < intMarkS.length; i++) {
				if (intMarkS[i] == 0) {
					System.out.println("S " + (i + 1));
				}
			}
			for (int i = 0; i < intMarkH.length; i++) {
				if (intMarkH[i] == 0) {
					System.out.println("H " + (i + 1));
				}
			}
			for (int i = 0; i < intMarkC.length; i++) {
				if (intMarkC[i] == 0) {
					System.out.println("C " + (i + 1));
				}
			}
			for (int i = 0; i < intMarkD.length; i++) {
				if (intMarkD[i] == 0) {
					System.out.println("D " + (i + 1));
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}
