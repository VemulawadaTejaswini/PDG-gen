class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(int i=1;;i++) {
				int buf = sc.nextInt();
				if(buf == 0) break;
				System.out.println(String.format("Case %d: %d", i, buf));
			}
		}
	}
}
