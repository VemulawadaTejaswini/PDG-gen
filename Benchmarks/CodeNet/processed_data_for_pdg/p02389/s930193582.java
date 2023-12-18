class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		int an = Integer.parseInt(a);
		int bn = Integer.parseInt(b);
		int sq = an * bn;
		int arnd = 2 * (an + bn);
		System.out.println(sq + " " + arnd);
	}
}
