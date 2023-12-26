class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intR = sc.nextInt();
		int intC = sc.nextInt();
		int Hyou[][] = new int[intR][intC];
		int intYokogoukei = 0;
		int intTategoukei = 0;
		int i = 0;
		int j = 0;
		int intSaigo = 0;
		for (i = 0; i < intR; i++) {
			for (j = 0; j < intC; j++) {
				Hyou[i][j] = sc.nextInt();
				intYokogoukei += Hyou[i][j];
				intSaigo += Hyou[i][j];
				System.out.print(Hyou[i][j] + " ");
			}
			System.out.println(intYokogoukei);
			intYokogoukei = 0;
		}
		for (int k = 0; k < intC; k++) {
			for (int l = 0; l < intR; l++) {
				intTategoukei += Hyou[l][k];
			}
			System.out.print(intTategoukei + " ");
			intTategoukei = 0;
		}
		System.out.println(intSaigo);
	}
}
