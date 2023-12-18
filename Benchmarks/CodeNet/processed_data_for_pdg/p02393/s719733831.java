class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int []  no = new int[3];
			int []  result = new int[3];
			for (int i=0; i<3; i++) {
				no[i] = sc.nextInt();
			}
			for (int i=0; i<3; i++) {
				int a;
				a = Math.min(no[0], no[1]);
				a = Math.min(a, no[2]);
				for (int j=0; j<3; j++) {
					if (a == no[j]) {
						no[j] = 10001;
						break;
					}
				}
				result[i] = a;
			}
			for (int i=0; i<3; i++) {
				System.out.print(result[i]);
				if (i < 2) System.out.print(" ");
				else System.out.println("");
			}
		}
	}
}
