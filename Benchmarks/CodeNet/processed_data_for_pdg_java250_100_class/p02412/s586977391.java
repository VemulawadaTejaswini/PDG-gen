class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intN = 0;
		int intX = 0;
		int intKekka = 0;
		while (true) {
			intN = sc.nextInt();
			intX = sc.nextInt();
			intKekka = 0;
			if (intN == 0 && intX == 0) {
				break;
			}
			for (int i = 1; i <= intN; i++) {
				for (int j = 1; j <= intN; j++) {
					for (int k = 1; k <= intN; k++) {
						if(i == j || j == k || i == k){
						}else if ( i + j + k == intX){
							intKekka ++;
							}
						}
					}
				}
			System.out.println(intKekka/6);
			}
		}
	}
