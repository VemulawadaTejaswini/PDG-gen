public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxL =0;
		int sum = 0;
		for(int i=0; i<N; i++) {
			int L = sc.nextInt();
			sum +=L;;
			maxL = Math.max(maxL, L);
		}
		if(maxL<sum-maxL) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
