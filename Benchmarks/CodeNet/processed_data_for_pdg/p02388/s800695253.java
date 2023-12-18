public class Main {
	public static void main(String[] args) {
		InputStreamReader insISR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(insISR);
		try {
			String strLine = reader.readLine();
			int intNum = Integer.parseInt(strLine);
			double dbNum = (double)intNum;
			Math.pow(dbNum, 3);
			intNum = (int)Math.pow(dbNum, 3);
			System.out.println(intNum);
		}catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}
