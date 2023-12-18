class Main {
	public static void main(String[] args) {
		int intVertical = 0;
		int intHorizontal = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strLine = br.readLine();
			String[] strLineAry = strLine.split(" ");
			intVertical = Integer.parseInt(strLineAry[0]);
			intHorizontal = Integer.parseInt(strLineAry[1]);
			int intArea = intVertical * intHorizontal;
			int intZhou = (intVertical + intHorizontal) * 2;
			System.out.println(intArea + " " + intZhou);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
