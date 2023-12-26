class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
			 int intH = sc.nextInt();
			 int intW = sc.nextInt();
			if(intH == 0 && intW == 0){
				break;
			}
			for (int i = 0; i < intH ; i++){
				for ( int j = 0; j < intW ; j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
