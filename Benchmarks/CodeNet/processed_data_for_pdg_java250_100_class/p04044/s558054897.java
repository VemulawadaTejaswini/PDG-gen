public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] nl = str.split(" ");
		int n = Integer.parseInt(nl[0]);
		String[] list = new String[n];
		for(int i=0; i<n; i++){
			list[i] = input.readLine( );
		}
		Arrays.sort(list);
		String answer = "";
		for(int i=0; i<n; i++){
			answer = answer + list[i];
		}
		System.out.println(answer);
	}
}
