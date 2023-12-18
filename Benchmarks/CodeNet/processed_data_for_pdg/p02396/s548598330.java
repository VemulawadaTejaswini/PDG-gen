class Main{
	public static void main(String[] args) {
		int x,i=0;
		Scanner kbd = new Scanner(System.in);
		x = kbd.nextInt();
		while(x != 0){
			System.out.println("Case " + (++i) +": " + x);
			x = kbd.nextInt();
		}
	}
}
