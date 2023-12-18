class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		for (int i=1; ; i++) {
			int x;
			if((x = stdIn.nextInt()) == 0)
				break;
			System.out.println("Case "+i+": "+x);
		}
	}
}
