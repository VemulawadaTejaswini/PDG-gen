public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			List<String> list = new ArrayList<String>();
			for(int i=0;i<N;i++) {
			list.add(sc.next());
			}
			List<String> ans = list.stream().distinct().collect(Collectors.toList());
			System.out.println(ans.size());
	}
}
