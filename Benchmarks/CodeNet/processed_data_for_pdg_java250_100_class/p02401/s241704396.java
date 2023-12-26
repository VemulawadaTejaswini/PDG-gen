class Main {
	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum3 = 0;
		int intAnswer = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<Integer> strArray = new ArrayList<Integer>();
			String strLine = "";
			while(true) {
				strLine = br.readLine();
				String[] strLineAry = strLine.split(" ");
				intNum1 = Integer.parseInt(strLineAry[0]);
				intNum3 = Integer.parseInt(strLineAry[2]);
				if(strLineAry[1].equals("+")) {
					intAnswer = intNum1 + intNum3;
				}else if(strLineAry[1].equals("-")) {
					intAnswer = intNum1 - intNum3;
				}else if(strLineAry[1].equals("*")) {
					intAnswer = intNum1 * intNum3;
				}else if(strLineAry[1].equals("/")) {
					intAnswer = intNum1 / intNum3;
				}else if(strLineAry[1].equals("?")) {
					break;
				}else {
					System.out.println("err");
				}
				strArray.add(intAnswer);
			}
			for(int i = 0; i < strArray.size(); i++) {
				System.out.println(strArray.get(i));
			}
		}catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数値で入力して下さい");
		}
	}
}
