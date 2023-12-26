public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set set = new HashSet<>();
		char s[] = sc.next().toCharArray();
		for (int i=0; i<s.length; i++) {
			set.add(s[i]);
		}
		System.out.println(set.size()==2 ? "Yes" : "No");
	}
}
