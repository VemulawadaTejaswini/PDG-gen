public class Main {
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		long n = Long.parseLong(st.nextToken());
	 		long m = Long.parseLong(st.nextToken());
	 		ArrayList<Integer> array = new ArrayList<Integer>();
	 		StringTokenizer st2 = new StringTokenizer(bf.readLine());
	 		long sum = 0;
	 		for(int j=0;j<m;j++){
	 			array.add(Integer.parseInt(st2.nextToken()));
	 			sum+=(long)(array.get(j));
	 		}
	 		if (sum > n)
	 			out.println(-1);
	 		else
	 			out.println(n-sum);
 		out.println();
 		out.close();
 	}
}
