class Main {
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)){
			int times = 1;
			while (true) {
				int input = sc.nextInt();
				if (input == 0) break;
				System.out.println("Case " + times + ": " + input);
				times++;
			}
		}
	}
}
