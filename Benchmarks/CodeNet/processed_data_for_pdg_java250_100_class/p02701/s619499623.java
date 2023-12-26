public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String yvgubhij = s.nextLine();
		HashSet<String> set = new HashSet<String>();
		for (int i=0;i<a;i++) {
			String b = s.nextLine();
			set.add(b);
		}
		System.out.println(set.size());
	}
}
