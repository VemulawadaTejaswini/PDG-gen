class Main{
	public static void main(String[] args) throws IOException{
		String str = null;
		int count = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		while(!str.equals("0")){
			System.out.println("Case "+ count +": " + str);
			count++;
			str = br.readLine();
		}
	}
}
