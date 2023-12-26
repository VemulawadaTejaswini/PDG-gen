public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		int x = sc.nextInt(); 
		int result = 0;
		for (int cntA = 0; cntA <= a; cntA++) {
			for (int cntB = 0; cntB <= b; cntB++) {
				for (int cntC = 0; cntC <= c; cntC++) {
					if ((500*cntA) + (100*cntB) + (50*cntC) == x) {
						result++;
					};
				}
			}
		}
		System.out.println(result);
	}
}
