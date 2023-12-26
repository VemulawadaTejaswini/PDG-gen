public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] array = new String[n];
		for(int i=0;i<n;i++){
			array[i]="hoge";
		}
		for(int i=0;i<k;i++) {
			int d = sc.nextInt();
			for(int j=0;j<d;j++) {
				int flag = sc.nextInt();
				array[flag-1] = "aa";
			}
		}
		sc.close();
		List<String> list = new ArrayList<>(Arrays.asList(array));
		List<String> set = new ArrayList<>();
        Collections.addAll(set, "hoge");
		list.removeAll(set);
		list.size();
		System.out.println(n-list.size());
	}
}
