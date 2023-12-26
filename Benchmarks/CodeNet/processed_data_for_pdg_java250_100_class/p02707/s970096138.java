public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i < n; i++) {
			int str = sc.nextInt();
			if (map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			} else {
				map.put(str, 1);
			}
		}
		sc.close();
		for(int i=1;i<=n;i++) {
			if(map.get(i)==null) {
				System.out.println(0);
			}else {
				System.out.println(map.get(i));
			}
		}
	}
}
