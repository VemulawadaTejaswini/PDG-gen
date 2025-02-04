public class Main {
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		Map<Integer, ArrayList<Integer>> tree = new HashMap<Integer, ArrayList<Integer>>();
 		for(int i = 1;i<=n;i++){
 			tree.put(i, new ArrayList<Integer>());
 		}
 		tree.get(1).add(-1);
 		for(int i = 0;i<n-1;i++){
	 		int a = Integer.parseInt(st.nextToken());
	 		tree.get(i+2).add(a);
	 		tree.get(a).add(i+2);
 		}
 		for(int i = 1;i<=n;i++){
 			out.println((tree.get(i).size()-1));
 		}
 		out.println();
 		out.close();
 	}
}
