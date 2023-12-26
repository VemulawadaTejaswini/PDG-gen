class Main {
	public static void main(String[] args) {
		double dbNum = 0;
		double dbArea = 0.0;
		double dbCircumference = 0.0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strLine = br.readLine();
			dbNum = Double.parseDouble(strLine);
			dbArea = dbNum * dbNum * Math.PI;
			dbCircumference = 2.0 * dbNum * Math.PI;
		    DecimalFormat insdf = new DecimalFormat("0.000000");
			System.out.println(insdf.format(dbArea) +  " " + insdf.format(dbCircumference));
			}catch(IOException e) {
				System.out.println(e);
			}catch(NumberFormatException e) {
				System.out.println("数値で入力して下さい");
			}
	}
}
