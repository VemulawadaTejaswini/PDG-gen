public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		List<String> S = new ArrayList<String>();
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			if(s.length() == L) {
				S.add(s);
			}else {
				i--;
			}
		}
		S.sort(Comparator.naturalOrder());
		for (String s : S) {
			System.out.print(s);
		}
	}
}
