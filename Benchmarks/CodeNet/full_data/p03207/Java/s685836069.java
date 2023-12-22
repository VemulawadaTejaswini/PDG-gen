public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int d = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int n = 1; n <= a; n++) {
			int b = sc.nextInt();
			d = d + b;
			list.add(b);
		}
		Integer i = Collections.max(list);
		int c  = d - i;
		i = i / 2;
		c = c + i;
		
		System.out.println(c);
	}
}
