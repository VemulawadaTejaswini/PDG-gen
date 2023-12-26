public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int move = 0;
		int fee = 0;
		int a[] = new int[n+1];
		for(int i = 0;i < m;i++) {
			move = sc.nextInt();
			a[move] = 1;
		}
		for(int i = x;i < n;i++) {
			fee = fee + a[i];
		}
		move = fee;
		fee = 0;
		for(int i = x;i > 0;i--) {
			fee = fee + a[i];
		}
		if(move > fee) {
			move = fee;
		}
		System.out.println(move);
		sc.close();
	}
}
