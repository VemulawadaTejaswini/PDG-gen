public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String n;
		ArrayList<String> S = new ArrayList<>();
		for(int i = 0; i<N; i++) {
			n = scan.next();
				S.add(n);
		}
		 Set<String> linkedHashSet = new LinkedHashSet<String>();
		    for (int i = 0; i < S.size(); i++) {
		    linkedHashSet.add(S.get(i));
		    }
		    Object[] strings_after = linkedHashSet.toArray();
		    System.out.println(strings_after.length);
	}
}
