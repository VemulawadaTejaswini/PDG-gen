class Main{
	public static void main(String[] args) {
		Scanner hoge = new Scanner(System.in);
		int a = hoge.nextInt();
		int b = hoge.nextInt();
		if(a < b) System.out.println("a < b");
		else if(a == b) System.out.println("a == b");
		else System.out.println("a > b");
	}
}
