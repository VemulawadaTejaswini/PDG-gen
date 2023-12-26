public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = parseInt(st.nextToken());
		int T = parseInt(st.nextToken());
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int c = parseInt(st.nextToken());
			int t = parseInt(st.nextToken());
			if(t <= T) {
				set.add(c);
			}
		}
		if(set.isEmpty()) {
			System.out.println("TLE");
		}else {
			System.out.println(set.first());
		}
	}
}
