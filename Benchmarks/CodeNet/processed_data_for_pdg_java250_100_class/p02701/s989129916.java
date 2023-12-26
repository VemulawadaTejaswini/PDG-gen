public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		String[] list = new String[N];
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for(int i=0; i<N;i++) {
			String s = sc.next();
			if(map.get(s)==null) {
				map.put(s, 1);
			}
		}
		int ans  = map.values().toArray().length;
		System.out.println(ans);
	}
}
