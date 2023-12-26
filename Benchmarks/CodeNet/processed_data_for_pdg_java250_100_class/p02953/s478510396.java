public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; i++) h[i] = sc.nextInt();
		sc.close();
		String ans = "Yes";
		for(int i = n-2; i >= 0; i--){
			if(h[i] > h[i+1]){
				h[i]--;
			}
		}
		for(int i = 0; i < n-1; i++){
			if(h[i] > h[i+1]) ans = "No";
		}
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}
