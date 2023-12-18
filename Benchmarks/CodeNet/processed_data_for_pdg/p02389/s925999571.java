class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = a * b;
		int y = (a + b) * 2;
		System.out.print(x);
		System.out.print(" ");
		System.out.print(y);
		System.out.println("");
		scan.close();
	}
}
