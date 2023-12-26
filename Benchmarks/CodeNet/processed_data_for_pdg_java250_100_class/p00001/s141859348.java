class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int top=0;
		int second=0;
		int third=0;
		int n;
		for(int i=0;i<10;i++){
			n = Integer.parseInt(in.readLine());
			if(n>third){
				third=n;
				if(n>second){
					third=second;
					second=n;
					if(n>top){
						second=top;
						top=n;
					}
				}
			}
		}
		System.out.println(top);
		System.out.println(second);
		System.out.println(third);
	}
}
