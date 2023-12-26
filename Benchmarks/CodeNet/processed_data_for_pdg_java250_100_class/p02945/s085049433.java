public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int ans = Math.max(a-b, Math.max(a+b, a*b));
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}
