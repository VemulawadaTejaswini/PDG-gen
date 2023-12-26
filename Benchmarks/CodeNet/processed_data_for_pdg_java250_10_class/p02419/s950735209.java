public class Main {
	public static void main(String[] args) {
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		while(true){
			try{
				String strScan = insBR.readLine();
				if("END_OF_TEXT".equals(strScan)){
					break;
				}else{
					list.add(strScan);
				}
			}catch(IOException e){
				System.out.println(e);
			}
		}
		String strFindLine = null;
		String strLine = null;
		int intCount = 0;
		for(int i = 0; i < list.size(); i++){
			if(i == 0){
				strFindLine = list.get(i);
				strFindLine = strFindLine.toLowerCase();
			}else{
				strLine = list.get(i);
				strLine = strLine.toLowerCase();
				String[] ary = strLine.split(" ");
				for(int j = 0; j < ary.length; j++){
					if(ary[j].length() == strFindLine.length()){
						int intJudge = ary[j].indexOf(strFindLine);
						if(-1 < intJudge){
							intCount++;
						}
					}
				}
			}
		}
		System.out.println( intCount);
	}
}
