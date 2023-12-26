public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		List<Integer> list2 = new ArrayList<Integer>(new HashSet<>(list));
		System.out.println(list2.size());
	}
}
