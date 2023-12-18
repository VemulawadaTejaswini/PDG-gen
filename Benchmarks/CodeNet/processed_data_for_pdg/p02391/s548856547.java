class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = sc.nextInt(); int b = sc.nextInt();
		if (a == b) System.out.println("a == b");
		else System.out.println(a>b?"a > b":"a < b");
	}
}
