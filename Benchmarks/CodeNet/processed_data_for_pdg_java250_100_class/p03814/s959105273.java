class Main{
	public static void main(String[] $){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int ans = s.lastIndexOf('Z') - s.indexOf('A') + 1;
		System.out.println(ans);
	}
}
