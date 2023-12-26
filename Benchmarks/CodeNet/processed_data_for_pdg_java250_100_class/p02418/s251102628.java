class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String b=br.readLine();
		StringBuilder sb=new StringBuilder(str);
		while(sb.length()<101)sb.append(str);
		str=sb.toString();
		System.out.println(str.contains(b)?"Yes":"No");
	}}
