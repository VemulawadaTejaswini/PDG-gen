public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] numlist = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numlist.length; i++) {
			numlist[i] = sc.nextInt();
		}
		Arrays.sort(numlist);
		for (int n = 0; n < numlist.length; n++) {
			if (n < numlist.length - 1) {
				System.out.print(numlist[n] + " ");
			} else if (n < numlist.length) {
				System.out.println(numlist[n]);
			}
		}
	}
}
