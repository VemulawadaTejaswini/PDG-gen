class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = 0; 
		int h = 0; 
		int m = 0; 
		int s = 0; 
		S = sc.nextInt();
		h = S / 3600;
		m = ( S % 3600 ) / 60;
		s = ( S % 3600 ) % 60;
		System.out.println( h + ":" + m + ":" + s  );
	}
}
