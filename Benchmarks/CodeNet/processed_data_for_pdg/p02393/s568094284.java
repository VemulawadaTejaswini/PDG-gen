public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result[] = new int[3];
		result[0] = in.nextInt();
		result[1] = in.nextInt();
		result[2] = in.nextInt();
		Arrays.sort(result);
		for(int i = 0; i < 2; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println(result[2]);
	}
}
