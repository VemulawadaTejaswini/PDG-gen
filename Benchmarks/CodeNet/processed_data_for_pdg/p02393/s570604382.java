public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []n = new int[3];
		for(int i = 0; i < 3; i++) {
			n[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(n);
		for(int i = 0; i < 2; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println(n[2]);
	}
}
