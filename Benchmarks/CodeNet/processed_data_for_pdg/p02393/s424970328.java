public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] intArray = new int[3];
		intArray[0] = A;
		intArray[1] = B;
		intArray[2] = C;
		Arrays.sort(intArray);
		System.out.println(intArray[0]+" "+intArray[1]+" "+intArray[2]);
	}
}
