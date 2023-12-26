class Main {
	public static void main(String[] args) {
		int intW = 0;
		int intH = 0;
		int intX = 0;
		int intY = 0;
		int intR =0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strLine = br.readLine();
			String[] strLineAry = strLine.split(" ");
			intW = Integer.parseInt(strLineAry[0]);
			intH = Integer.parseInt(strLineAry[1]);
			intX = Integer.parseInt(strLineAry[2]);
			intY = Integer.parseInt(strLineAry[3]);
			intR = Integer.parseInt(strLineAry[4]);
			if(-100 <= intX || intY < 100 || 0 < intW || intR <= 100) {
			} else {
				System.out.println("−100?x,y?100,0<W,r?100です");
			}
			if((intX + intR) <= intW &&
			0 <= (intX -intR) &&
			(intY + intR) <= intH &&
			0 <= (intY - intR) ) {
				System.out.println("Yes");
			} else 	{
				System.out.println("No");
			}
			}catch(IOException e) {
				System.out.println(e);
			}catch(NumberFormatException e) {
				System.out.println("数値で入力して下さい");
			}
	}
}
