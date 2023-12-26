public class Main  {
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		int n = Integer.parseInt(st.nextToken());
	 		int k = Integer.parseInt(st.nextToken());
	 		int count = 0;
 		while(n>0){
 			n/=k;
 			count++;
 		}
 		out.println(count);
 		out.close();
 	}
}
