class Main {
	public static void main(String[] args) {
		final int intFactorial = 3;
		int intAnswer = 1;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strLine = br.readLine();
			int intLine = Integer.parseInt(strLine);
			for(int i = 0; i < intFactorial; i++) {
				intAnswer = intAnswer * intLine;
			}
			System.out.println(intAnswer);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
