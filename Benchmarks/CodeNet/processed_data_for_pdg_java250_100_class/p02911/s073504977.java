public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<Q;i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		int score[] = new int[N];
		Arrays.fill(score, K);
		int vector[] = new int[N];
		Arrays.fill(vector, Q);
		for(int i:list) {
			vector[i-1] = vector[i-1]-1;
		}
		for(int j=0;j<N;j++) {
			score[j] = score[j]-vector[j];
		}
		for(int i:score) {
			if(i<=0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}
