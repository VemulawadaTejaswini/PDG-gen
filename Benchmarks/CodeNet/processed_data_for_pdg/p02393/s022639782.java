class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] str1Ary = str.split(" ");
		int[] ary = new int[str1Ary.length];
		for(int i = 0; i < str1Ary.length; i++){
			ary[i] = Integer.parseInt(str1Ary[i]);
		}
		Arrays.sort(ary);
		for(int i = 0; i < ary.length; i++){
			System.out.print(ary[i]);
			if(i < ary.length - 1){
				System.out.print(" ");
			}
		}
                System.out.println();
	}
}
