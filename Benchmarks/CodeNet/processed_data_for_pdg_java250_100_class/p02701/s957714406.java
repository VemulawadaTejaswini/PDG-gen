public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A[] = new String[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.next();
		}
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		for(int i=0;i<N;i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i],map.get(A[i])+1);
			}else {
				map.put(A[i],1);
			}
		}
		int ans = 0;
		for(String key : map.keySet()) {
			int temp = map.get(key);
				ans ++;
		}
		System.out.println(ans);
	}
}
