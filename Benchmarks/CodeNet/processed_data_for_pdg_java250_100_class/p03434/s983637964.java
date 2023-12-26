public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			a.add(stdIn.nextInt());
		}
		Collections.sort(a);
		int ans = 0;
		for(int i = a.size() - 1; 0 <= i; i --) {
			ans += a.get(i);
			if(0 <= i - 1) {
				i --;
				ans -= a.get(i);
			}
		}
		System.out.println(ans);
	}
}
