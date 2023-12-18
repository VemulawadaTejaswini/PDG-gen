class Main{
	public static void main(String[] arg){
		String buf;
		int num;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			buf = br.readLine();
			num = Integer.parseInt(buf);
			System.out.println(num * num *num);
		} catch (Exception e){}
	}
}
