class Main {
	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strLine = br.readLine();
			String[] strLineAry = strLine.split(" ");
			intNum1 = Integer.parseInt(strLineAry[0]);
			intNum2 = Integer.parseInt(strLineAry[1]);
			if(intNum1 < intNum2) {
				System.out.println("a < b");
			}else if(intNum1 > intNum2) {
				System.out.println("a > b");
			}else {
				System.out.println("a == b");
			}
			}catch(IOException e) {
				System.out.println(e);
			}catch(NumberFormatException e) {
				System.out.println("数値で入力して下さい");
			}
	}
}
