public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		int numberC = sc.nextInt();
		int numberX = sc.nextInt();
		int sumNum = 0;
		int flagNum = 0;
		for(int i = 0; i <= numberA; i++) {
			for(int j = 0; j <= numberB; j++) {
				for(int k = 0; k <= numberC; k++) {
					sumNum = ((500 * i) + (100 * j) + (50 * k));
					if(numberX == sumNum) {
						flagNum++;
					}
				}
			}
		}
			System.out.print(flagNum);
	}
}
