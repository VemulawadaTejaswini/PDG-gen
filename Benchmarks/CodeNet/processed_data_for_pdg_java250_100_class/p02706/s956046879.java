public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long cnt = 0;
		for(int i = 0; i<M; i++) {
			cnt += sc.nextLong();
		}
		if(N-cnt>-1) System.out.println(N-cnt);
		else System.out.println(-1);
	}
}
