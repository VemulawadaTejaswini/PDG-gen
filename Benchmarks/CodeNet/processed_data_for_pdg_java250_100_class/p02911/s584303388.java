public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int point = sc.nextInt();
		int anser_C = sc.nextInt();
		int[] part = new int[N];
			Arrays.fill(part, point-anser_C);
		for(int i = 1; i <= anser_C; i++ ) {
			part[sc.nextInt()-1]++;
		}
		for(int i = 0; i<N; i++) {
			if(part[i] <= 0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}
