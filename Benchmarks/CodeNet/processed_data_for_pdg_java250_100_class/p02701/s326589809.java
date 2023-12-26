public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = "";
		Set<String> set = new HashSet<String>();
		for(int i=0; i<N; i++) {
			S = sc.next();
			set.add(S);
		}
		System.out.println(set.size());
	}		
}
