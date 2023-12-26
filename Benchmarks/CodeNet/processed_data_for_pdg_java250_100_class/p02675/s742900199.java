public class Main {
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		int k = n%10;
 		if (k == 3)
 			out.println("bon");
 		else if (k == 0 || k == 1 || k == 6 || k == 8)
 			out.println("pon");
 		else
 			out.println("hon");
 		out.close();
 	}
}
