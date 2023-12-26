public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		if((A == B && A != C) || (A != B && A == C) || (B == C) && (B != A)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}	
}
