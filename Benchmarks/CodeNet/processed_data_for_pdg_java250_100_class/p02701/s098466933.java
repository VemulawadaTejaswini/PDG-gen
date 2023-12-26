public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int n = Integer.valueOf(num);
		ArrayList<String> s = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			s.add(sc.nextLine());
		}
		Set<String> linkedHashSet = new LinkedHashSet<String>();
	    for (int i = 0; i < s.size(); i++) {
	    	linkedHashSet.add(s.get(i));
	    }
	    System.out.println(linkedHashSet.size());
	}
}
