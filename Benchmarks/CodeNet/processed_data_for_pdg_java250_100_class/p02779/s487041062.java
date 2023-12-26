public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] IN =br.readLine().split(" ") ; 
		String ans = "YES";
			HashMap<String,Integer> count = new HashMap<String,Integer>();
			for(int i=0; i<N; i++) {
				if (!count.containsKey(IN[i])){
					count.put(IN[i], 1); 
				}else{
					int now = count.get(IN[i]); 
					count.replace(IN[i], now + 1);
				}
			}
			for(int key1:count.values()) {
				if(key1 > 1) {
					ans = "NO";
				}
			}
		System.out.println(ans);	
	}
}
