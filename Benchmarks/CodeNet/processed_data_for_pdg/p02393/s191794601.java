public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int[] arr = new int[3];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			java.util.Arrays.sort(arr);
			System.out.println(arr[0] +  " " + arr[1] + " " + arr[2]);
		}
	}
}
