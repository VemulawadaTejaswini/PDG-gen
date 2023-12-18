public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[] { a, b, c };
		Arrays.sort(arr);
		int i;
		for (i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i]);
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
