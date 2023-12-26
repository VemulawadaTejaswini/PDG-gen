public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			set.add(sc.nextInt());
		}
		if(set.size() != n) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}
