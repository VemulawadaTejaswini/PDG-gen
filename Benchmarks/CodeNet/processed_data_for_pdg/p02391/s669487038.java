class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a, b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] str1Ary = str.split(" ");
		a = Integer.parseInt(str1Ary[0]);
		b = Integer.parseInt(str1Ary[1]);
		if (a > b){
			System.out.println("a > b");
		}else if (a < b){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
	}
}
