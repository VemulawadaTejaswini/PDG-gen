public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n, b, f, r, v, c;
		int i = 0;
		c = 0;
		n = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<Integer>();
		for (; i < 120; i++) {
			list.add(0);
		}
		for (int count = 0; count < n; count++) {
			b = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			v = scan.nextInt();
			if (b == 1) {
				if (f == 1) {
					c = r - 1;
				} else if (f == 2) {
					c = 10 + r - 1;
				} else if (f == 3) {
					c = 20 + r - 1;
				}
			} else if (b == 2) {
				if (f == 1) {
					c = 30 + r - 1;
				} else if (f == 2) {
					c = 30 + 10 + r - 1;
				} else if (f == 3) {
					c = 30 + 20 + r - 1;
				}
			} else if (b == 3) {
				if (f == 1) {
					c = 60 + r - 1;
				} else if (f == 2) {
					c = 60 + 10 + r - 1;
				} else if (f == 3) {
					c = 60 + 20 + r - 1;
				}
			} else if (b == 4) {
				if (f == 1) {
					c = 90 + r - 1;
				} else if (f == 2) {
					c = 90 + 10 + r - 1;
				} else if (f == 3) {
					c = 90 + 20 + r - 1;
				}
			}
			if (list.get(c) != 0) {
				list.set(c, list.get(c) + v);
			} else {
				list.set(c, v);
			}
		}
		i = 0;
		sb.append(" ");
		for (; i < 120; i++) {
			if ((i) % 10 == 0) {
				if ((i) % 30 == 0) {
						sb.append("\n");
						sb.append("####################");
						sb.append("\n");
						sb.append(" ");
					}
				} else {
					sb.append("\n");
					sb.append(" ");
				}
			}
			sb.append(list.get(i));
			if ((i) % 10 == 9) {
			} else {
				sb.append(" ");
			}
		}
		System.out.println(new String(sb));
	}
}
