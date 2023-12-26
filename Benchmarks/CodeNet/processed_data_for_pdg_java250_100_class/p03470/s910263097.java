public class Main {
	public static void main(String[] args) {
		int n = 0;
		ArrayList<Integer> uniqueList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			intList.add(x);
		}
		System.out.println(new HashSet<>(intList).size());
	}
}
