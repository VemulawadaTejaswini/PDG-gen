public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int max = 0;
		for(int i=0;i<N;i++) {
			int val = sc.nextInt();
			if(val >= max) {
				max = val;
			}
			sum += val;
		}
		if (sum > 2*max) System.out.println("Yes");
		else System.out.println("No");
	}
}
