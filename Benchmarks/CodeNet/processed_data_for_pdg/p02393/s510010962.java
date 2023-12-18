public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		String[] input = buf.split(" ");
		int[] array = new int[3];
		array[0] = Integer.parseInt(input[0]);
		array[1] = Integer.parseInt(input[1]);
		array[2] = Integer.parseInt(input[2]);
		Arrays.sort(array);
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}
}
