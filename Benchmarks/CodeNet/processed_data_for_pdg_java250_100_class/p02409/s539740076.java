class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] Daigaku = new int[4][3][10];
		int intKen = sc.nextInt();
		int intTou = 0;
		int intKai = 0;
		int intFuroa = 0;
		int intHito = 0;
		for (int i = 0; i < intKen; i++) {
			intTou = sc.nextInt();
			intKai = sc.nextInt();
			intFuroa = sc.nextInt();
			intHito = sc.nextInt();
			Daigaku[intTou-1][intKai-1][intFuroa-1] += intHito;
		}
		for (int i = 0; i < 4 ; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" " + Daigaku[i][j][k]);
				}
				System.out.println();
			}
			if( i < 3){
				System.out.println("####################");
			}
		}
	}
}
