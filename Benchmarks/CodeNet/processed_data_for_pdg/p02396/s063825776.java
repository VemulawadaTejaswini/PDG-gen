class Main{
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String str = br.readLine();	
		int count= 1;	
		while(!str.equals("0"))	
		{
			System.out.println("Case "+count+": "+str);	
			count++;	
			str=br.readLine();	
		}
	}
}
