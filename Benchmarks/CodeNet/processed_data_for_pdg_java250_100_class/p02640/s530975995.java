class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); 
		int Y = sc.nextInt(); 
		if(Y > 4*X || Y < 2*X || Y%2==1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
