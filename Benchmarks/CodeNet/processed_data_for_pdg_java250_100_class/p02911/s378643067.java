public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sanka = scan.nextInt();
		int point = scan.nextInt();
		int seikai = scan.nextInt();
		int[] array = new int[seikai];
		for(int i=0;i<seikai;i++) {
			array[i] = scan.nextInt();
		}
		int[] yusho = new int[sanka];
		Arrays.fill(yusho, point-seikai);
		for(int i=0;i<seikai;i++) {
			yusho[array[i]-1]++;
		}
		for(int i=0;i<sanka;i++) {
			System.out.println(yusho[i] > 0?"Yes":"No");
		}
		scan.close();
	}
}
