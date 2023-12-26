public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		String strLine = null;
		try {
			strLine = insBR.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		char[] ary = strLine.toCharArray();
		for(int i = 0; i < ary.length; i++){
			if(Character.isLowerCase(ary[i])){
				ary[i] = Character.toUpperCase(ary[i]);
			}else{
				ary[i] = Character.toLowerCase(ary[i]);
			}
		}
		String strNewLine = new String(ary);
		System.out.println(strNewLine);
	}
}
