class Main {
	public static void main(String[] args) {
		final int intMinute  = 60;
		final int intSecond = 60;
		int intAnswerHour = 0;
		int intAnswerMinute = 0;
		int intAnswerSecond = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strLine = br.readLine();
			int intLine = Integer.parseInt(strLine);
			intAnswerHour = intLine / (intMinute * intSecond);
			intAnswerMinute = (intLine % (intMinute * intSecond)) / intSecond ;
			intAnswerSecond = intLine % intSecond;
			System.out.println(intAnswerHour + ":" + intAnswerMinute + ":" + intAnswerSecond);
		}catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数値で入力して下さい");
		}
	}
}
