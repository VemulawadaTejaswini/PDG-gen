class Main{
    static Scanner scan;
    public static void main(String[] args) {
	scan = new Scanner(System.in);
	int n;
	for (int i = 1; ; i++) {
	    n = scan.nextInt();
	    if (n == 0) break;
	    System.out.printf("Case %d: %d\n", i, n);
	}
    }
}
