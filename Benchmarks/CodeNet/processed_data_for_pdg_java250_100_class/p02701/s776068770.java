public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		Set<String> S = new HashSet<>();
		for(int i = 0;i<N;i++) S.add(cin.next());
		System.out.println(S.size());
	}
}
