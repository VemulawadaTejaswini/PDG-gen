public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		Integer[] hList = new Integer[10];
		for (int num = 0; num < 10; num++) {
			int h = Integer.parseInt(sb.readLine());
			hList[num] = h;
		}
		Arrays.sort(hList, Collections.reverseOrder());
		for (int rank = 0; rank < 3; rank++) {
			System.out.println(hList[rank]);
		}
	}
}
