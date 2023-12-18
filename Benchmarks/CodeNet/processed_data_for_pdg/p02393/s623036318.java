public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int a = Integer.parseInt(tmpArray[0]);
		int b = Integer.parseInt(tmpArray[1]);
		int c = Integer.parseInt(tmpArray[2]);
		int[] array = new int[3];
		array[0] = a; array[1] = b; array[2] = c;
		Arrays.sort(array);
		System.out.printf("%d %d %d\n", array[0], array[1], array[2]);
	}
}
