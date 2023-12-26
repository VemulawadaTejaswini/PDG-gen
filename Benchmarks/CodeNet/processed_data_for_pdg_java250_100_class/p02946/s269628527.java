public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		int min = x-k+1;
		int max = x+k-1;
		System.out.print(min + " ");
		int num = min;
		for(int i=1;num<max;i++) {
			num = num + 1;
			System.out.print(num + " ");
		}
	}
}
