class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		scan.close();
		String result = "No";
		if(N%2==0){
			String tmp = null;
			tmp = S.substring(0,N/2);
			if(S.equals(tmp+tmp)){
				result = "Yes";
			}
		}
		System.out.println(result);
	}
}
