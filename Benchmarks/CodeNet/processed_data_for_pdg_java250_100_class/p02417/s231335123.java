public class Main {
	public static void main(String[] args) {
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		String strLine = "";
		while(true){
			try{
				String strScan = insBR.readLine();
				if("".equals(strScan) || strScan == null){
					break;
				}else{
					strLine += strScan;
				}
			}catch(IOException e){
				System.out.println(e);
			}
		}
		strLine = strLine.toLowerCase();
		char[] aryLine= strLine.toCharArray();
		char x = 'a';
		for(int i = 'a'; i <= 'z'; i++){
			int intCount = 0;
			for(int j = 0; j < aryLine.length; j++){
				int alphNum = aryLine[j];
				if( i == alphNum){
					intCount++;
				}
			}
			System.out.print(x++);
			System.out.println(" : " + intCount);
		}
	}
}
