public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int w, h, x, y, r;
		w = scan.nextInt();
		h = scan.nextInt();
		x = scan.nextInt();
		y = scan.nextInt();
		r = scan.nextInt();
		String str;
		str = "No";
		boolean flg;
		flg = false;
		if (w > x) {
			if (x <= 0) {
				str = "No";
			} else {
				if (h > y) {
					if (y <= 0) {
						str = "No";
					} else {
						flg = true;
					}
				} else {
					str = "No";
				}
			}
		} else {
			str = "No";
		}
		if (flg) {
			if (w >= (x + r)) {
				if (w >= (y + r)) {
					str = "Yes";
				} else {
					str = "No";
				}
			} else {
				str = "No";
			}
		}
		System.out.println(str);
	}
}
