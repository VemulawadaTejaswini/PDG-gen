class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intM = 0;
		int intF = 0;
		int intR = 0;
		int intSum = 0;
		while (true) {
			intM = sc.nextInt();
			intF = sc.nextInt();
			intR = sc.nextInt();
			if (intM == -1 && intF == -1 && intR == -1) {
				break;
			}
			if (intM == -1 || intF == -1) {
				System.out.println("F");
			} else if (intM + intF >= 80) {
				System.out.println("A");
			} else if (intM + intF >= 65) {
				System.out.println("B");
			} else if (intM + intF >= 50 || intR >= 50) {
				System.out.println("C");
			} else if (intM + intF >= 30) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}
