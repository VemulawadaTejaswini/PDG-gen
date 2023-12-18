class Main {
	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		int intNum3 = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strLine = br.readLine();
			String[] strLineAry = strLine.split(" ");
			intNum1 = Integer.parseInt(strLineAry[0]);
			intNum2 = Integer.parseInt(strLineAry[1]);
			intNum3 = Integer.parseInt(strLineAry[2]);
			int intChange = 0;
			if(intNum1 > intNum2) {
				intChange = intNum1;
				intNum1 = intNum2;
				intNum2 = intChange;
			}
			if(intNum2 > intNum3) {
				intChange = intNum2;
				intNum2 = intNum3;
				intNum3 = intChange;
			}
			if(intNum1 > intNum2) {
				intChange = intNum1;
				intNum1 = intNum2;
				intNum2 = intChange;
			}
			System.out.println(intNum1 + " " + intNum2 + " " + intNum3);
			}catch(IOException e) {
				System.out.println(e);
			}catch(NumberFormatException e) {
				System.out.println("数値で入力して下さい");
			}
	}
}
