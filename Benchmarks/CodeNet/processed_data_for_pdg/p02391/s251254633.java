class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] array = str.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		if(a < b) System.out.println("a < b");
		else if(a > b) System.out.println("a > b");
		else if(a == b) System.out.println("a == b");
	}
}
