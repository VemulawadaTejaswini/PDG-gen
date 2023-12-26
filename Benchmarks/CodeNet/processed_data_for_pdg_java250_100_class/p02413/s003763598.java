public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int num = 0;
		int total = 0;
		int [] addc = new int[c];
		for (int i=0;i<r; i++){
			int addr = 0;
			for (int j=0; j<c; j++){
				num = sc.nextInt();
				System.out.print(num + " ");
				addr += num;
				addc[j] += num;
				total += num;
			}
			System.out.println(addr);
		}
		for (int j=0; j<c; j++){
			System.out.print(addc[j] + " ");
		}
		System.out.println(total);
	}
}
