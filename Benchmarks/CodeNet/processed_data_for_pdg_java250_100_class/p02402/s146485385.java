class Main {
	public static void main(String[] args) {
		int intNum = 0;
		int intMin = 0;
		int intMax = 0;
		double dbSum = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strLine = br.readLine();
			intNum = Integer.parseInt(strLine);
			strLine = br.readLine();
			String[] strLineAry = strLine.split(" ");
			intMin = Integer.parseInt(strLineAry[0]);
			intMax = intMin;
			dbSum += (double)intMin;
			for(int i = 1; i < intNum; i++) {
				int intNum2 = Integer.parseInt(strLineAry[i]);
				if(intNum2 < intMin) {
					intMin = intNum2;
				}
				if(intMax < intNum2) {
					intMax = intNum2;
				}
				dbSum += (double)intNum2;
			}
		    DecimalFormat insDF = new DecimalFormat("0");
			System.out.println(intMin + " " + intMax + " " + insDF.format(dbSum));
		}catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数値で入力して下さい");
		}
	}
}
