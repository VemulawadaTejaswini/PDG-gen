class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] num=str.split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		int c=Integer.parseInt(num[2]);
		int tmp;
		if(a>c){
			tmp=a;
			a=c;
			c=tmp;
		}
		if(a>b){
			tmp=a;
			a=b;
			b=tmp;
		}
		if(b>c){
			tmp=b;
			b=c;
			c=tmp;
		}
		System.out.println(a+" "+b+" "+c);
	}
}
