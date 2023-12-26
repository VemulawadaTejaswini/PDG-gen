class Main {
	public static void main(String[] args) {
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(
					System.in));
			String strNum = insBR.readLine();
			int intNum = Integer.parseInt(strNum);
			String strLine = insBR.readLine();
			String[] strAry = strLine.split(" ");
			int[] intAry = new int[intNum];
			for (int i = 0; i < intNum; i++) {
				intAry[i] = Integer.parseInt(strAry[i]);
			}
			for (int i = 0; i < intNum / 2; i++) {
				int intChage = 0;
				intChage = intAry[i];
				intAry[i] = intAry[intNum - 1 - i];
				intAry[intNum - 1 - i] = intChage;
			}
			for (int i = 0; i < intNum; i++) {
				if(i ==0) {
					System.out.print(intAry[i]);
				} else {
					System.out.print(" " + intAry[i]);
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
