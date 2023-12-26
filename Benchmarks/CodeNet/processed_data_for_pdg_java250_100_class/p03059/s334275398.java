public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		sc.close();
		int total = 0;
		for(int second = 1; second <= T ; second++) {
			if(second % A == 0) {
				total +=  B;
			}
		}
		System.out.println(total);
	}
}
