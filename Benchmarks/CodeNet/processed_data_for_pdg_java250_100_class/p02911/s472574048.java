public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] mens = new int[n];
		for(int i = 0; i < n; i++) {
			mens[i] = k - q;
		}
		for(int i = 0; i < q; i++) {
			int j = sc.nextInt() - 1;
			mens[j]++;
		}
		for(int man: mens) {
			if(man > 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
