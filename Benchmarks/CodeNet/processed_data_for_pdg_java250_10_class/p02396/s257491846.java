class Main {
	public static void main(String[] args) {
		try{
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strLine = "";
			int intNum = 1;
			ArrayList<String> strArray = new ArrayList<String>();
			for(int i = 0; true; i++) {
				strLine = insBR.readLine();
				strArray.add(strLine);
				intNum  = Integer.parseInt(strLine);
				if(intNum == 0) {
					break;
				}
			}
			for(int i = 0; i < strArray.size() - 1; i++) {
				System.out.println("Case " + (i+1) + ": " + strArray.get(i));
			}
		}catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数値で入力して下さい");
		}
	}
}
