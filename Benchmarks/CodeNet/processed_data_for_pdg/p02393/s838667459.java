public class Main {
	public static void main(String args[]){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String[] strA = insBR.readLine().split(" ");
			int[] intA = new int[strA.length];
			String strMessage = "";
			for(int i = 0;i < strA.length ;i++){
				intA[i] = Integer.parseInt(strA[i]);
			}
			for(int i = 0;i < intA.length - 1;i++){
				for(int j = intA.length -1;i < j;j--){
					if(intA[j] < intA[i]){
						int intAct = intA[i];
						intA[i] = intA[j];
						intA[j] = intAct;
					}
				}
			}
			System.out.println(intA[0] + " " + intA[1] + " " + intA[2]);
		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}
}
