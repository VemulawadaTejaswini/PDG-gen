public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int[] arr = { a, b, c };
		Arrays.parallelSort(arr);
		if (arr[0] == 5 && arr[1] == 5 && arr[2] == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
