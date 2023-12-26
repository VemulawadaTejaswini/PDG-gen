public class Main {
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int k = Integer.parseInt(bf.readLine());
 		String input = bf.readLine();
 		if (input.length() <= k){
 			out.println(input);
 		}
 		else
 		{
 			out.println(input.substring(0, k) + "...");
 		}
 		out.close();
 	}
}
