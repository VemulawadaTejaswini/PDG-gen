public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String strNum = br.readLine();
		String[] strNumList = strNum.split(" ");
		int intNumA = Integer.parseInt(strNumList[0]);
		int intNumB = Integer.parseInt(strNumList[1]);
		String strResult = "";
		if(intNumA != intNumB) {
			if(intNumA < intNumB) {
				strResult = "a < b";
			}else {
				strResult = "a > b";
			}
		}else {
			strResult = "a == b";
		}
		System.out.println(strResult);
	}
}
