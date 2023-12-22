	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int W = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		if(W == a || W == b || a == b) {
			System.out.print(0);
		}
		else if(a > b) {
			System.out.print(a - (W + b));
		}
		else if(b > a) {
			System.out.print(b - (W + a));
		}
	}
