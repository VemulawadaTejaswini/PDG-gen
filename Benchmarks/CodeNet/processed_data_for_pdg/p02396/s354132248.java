class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		StringBuilder str = new StringBuilder();
		while(true){
			i++;
			String str2 = br.readLine();
			int x = Integer.parseInt(str2);
			if(x == 0){
				break;
			}
			str.append("Case " + i + ": " + x + "\n");
		}
		System.out.print(str);
	}
}
