public class Main {
	public static void main(String[] args) {
		String strInput = null;
		int intProv = 0;
		int[] intNumList = new int[3];
		boolean NumOk = false;
		try {
			BufferedReader strLine = new BufferedReader(new InputStreamReader(System.in));
			strInput = strLine.readLine();
			String[] strNumList = strInput.split(" ");
			for (int i = 0; i < strNumList.length; i++) {
				intNumList[i] = Integer.parseInt(strNumList[i]);
			}
			for (int i = 0; i < intNumList.length; i++) {
				if (intNumList[i] >= 1 && intNumList[i] <= 10000) {
					NumOk = true;
				}else{
					NumOk = false;
					break;
				}
			}
			if (NumOk) {
				for (int i = 0; i < intNumList.length; i++) {
					for (int j = i + 1; j < intNumList.length;j++) {
						if(intNumList[i] >= intNumList[j]){
							intProv =  intNumList[i];
							intNumList[i] = intNumList[j];
							intNumList[j] = intProv;
						}
					}
				}
				System.out.println(intNumList[0] + " " + intNumList[1] + " " + intNumList[2]);
			}
		}catch (IOException e1) {
			System.out.println(e1);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}
}
