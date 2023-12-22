public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<char[]> list = new ArrayList<char[]>();
		try {
			boolean isContinue = true;
			while(isContinue){
				String strLine = insBR.readLine();
				if(!"0".equals(strLine)){
					char[] ary = strLine.toCharArray(); 
					list.add(ary);
				}else{
					isContinue = false;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < list.size(); i++){
			int intSumNum = 0;
			char[] ary = list.get(i);
			for(int j = 0; j < ary.length; j++){
				int intNum = 0;
				intNum = Character.getNumericValue(ary[j]);
				intSumNum += intNum;
			}
			System.out.println(intSumNum);
		}
	}
}
