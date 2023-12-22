public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strLine = "";
		boolean isContinue = true;
		while(isContinue){
			if(scan.hasNext()){
				String strScan = scan.nextLine();
				strLine += strScan;
			}else{
				scan.close();
				break;
			}
		}
		char[] aryLine= strLine.toCharArray();
		char x = 'a';
		for(int j = 'a'; j <= 'z'; j++){
			int intCount = 0;
			for(int i = 0; i < aryLine.length; i++){
				if(Character.isUpperCase(aryLine[i])){
					aryLine[i] = Character.toLowerCase(aryLine[i]);
				}
				if( j == aryLine[i]){
					intCount++;
				}
			}
			String az = String.valueOf(j);
			System.out.print(x++);
			System.out.println(" : " + intCount);
		}
	}
}
