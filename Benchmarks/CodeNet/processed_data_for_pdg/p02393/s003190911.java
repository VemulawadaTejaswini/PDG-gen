public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] st = {a, b, c};
		if(st[0] > st[1]) {
			st[0] = st[1];
			st[1] = a;
		}
		if(st[1] > st[2]) {
			st[2] = st[1];
			st[1] = c;
		}
		if(st[0] > st[1]) {
			st[0] = st[1];
			st[1] = b;
		}
		for(int i = 0; i < 3 ; i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(st[i]);
		}
		System.out.printf("\n");
	}
}
