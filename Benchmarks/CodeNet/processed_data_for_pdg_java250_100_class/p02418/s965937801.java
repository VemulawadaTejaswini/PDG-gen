class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();			
		String searchStr = br.readLine();			
		String ringInputStr = inputStr + inputStr;
		if(ringInputStr.contains(searchStr)) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
