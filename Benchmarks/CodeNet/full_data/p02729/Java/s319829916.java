	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int M = sc.nextInt();
		// スペース区切りの整数の入力
		int N = sc.nextInt();
//		int c = sc.nextInt();
	
		// 文字列の入力
//		String s = sc.next();
		// 出力
//		System.out.println((a+b+c) + " " + s);
		
		System.out.println(M*(M-1)/2 + N*(N-1)/2);

	}
}