public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		ArrayList list = new ArrayList();
		for(int i = 0; i < m; i++) {
			list.add(scan.nextInt());
		}
		int s = 0;
		for(int i = 0; i < m; i++) {
			s += (int)list.get(i);
		}
		if(s > n) {
			System.out.println(-1);
		}else {
			System.out.println(n - s);
		}
	}
}
