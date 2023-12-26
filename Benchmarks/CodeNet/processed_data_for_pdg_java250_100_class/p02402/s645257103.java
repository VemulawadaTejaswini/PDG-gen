public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");
		int[] input = new int[n];
		long sum = 0;
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
			sum += input[i];
		}
		Arrays.sort(input);
		System.out.printf("%d %d %d\n", input[0], input[input.length - 1], sum);
	}
}
