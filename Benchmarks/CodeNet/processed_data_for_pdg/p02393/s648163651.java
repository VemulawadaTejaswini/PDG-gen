class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b) {
			int n = b;
			b = a;
			a = n;
		} 
		if(b > c) {
			int n = c;
			c = b;
			b = n;
		}
		if(a > b) {
			int n = b;
			b = a;
			a = n;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
