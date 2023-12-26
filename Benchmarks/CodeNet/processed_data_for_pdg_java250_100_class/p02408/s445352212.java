class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intKazu = sc.nextInt();
		int card[][] = new int[4][13];
		String strEzura = "";
		int intSuuji = 0;
		for (int i = 0; i < intKazu; i++) {
			strEzura = sc.next();
			intSuuji = sc.nextInt();
			if (strEzura.equals("S")) {
				card[0][intSuuji - 1] = 1;
			} else if (strEzura.equals("H")) {
				card[1][intSuuji - 1] = 1;
			} else if (strEzura.equals("C")) {
				card[2][intSuuji - 1] = 1;
			} else if (strEzura.equals("D")) {
				card[3][intSuuji - 1] = 1;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (card[i][j] == 0){
					if(i == 0){
						System.out.println("S " + (j + 1));
					}else if ( i == 1){
						System.out.println("H " + (j + 1 ));
					}else if ( i == 2) {
						System.out.println("C " + (j + 1 ));
					}else if ( i == 3) {
						System.out.println("D " + (j + 1 ));
					}
				}
			}
		}
	}
}
