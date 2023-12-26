public class Main {
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		long t = Long.parseLong(bf.readLine());
 		long j = 100;
 		int count = 0;
 		while(j < t){
 			count++;
 			j = j+j/100;
 		}
 		out.println(count);
 		out.close();
 	}
}
