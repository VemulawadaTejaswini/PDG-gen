public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");
		int[] input = new int[n];
		for(int i = 0; i < n; i++){
			input[n - i - 1] = Integer.parseInt(tmpArray[i]);
		}
		System.out.print(input[0]);
		for(int i = 1 ; i < n; i++){
			System.out.print(" "+ input[i]);
		}
		System.out.println();
	}
}
