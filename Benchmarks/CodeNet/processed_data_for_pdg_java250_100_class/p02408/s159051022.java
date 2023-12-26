public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n, count, i;
		i = 0;
		count = 0;
		n = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		for (; count < n; count++) {
			list.add(scan.next());
			list2.add(scan.nextInt());
		}
		for (; i < 13; i++) {
			list3.add(i+1);
		}
		count = 0;
		i = 0;
		for (; count < n; count++) {
			if (list.get(count).equals("S")) {
				list3.set(list2.get(count) - 1, 0);
			}
		}
		for (; i < 13; i++) {
			if (list3.get(i) != 0) {
				sb.append("S");
				sb.append(" ");
				sb.append(list3.get(i));
				sb.append("\n");
			}
		}
		list3.clear();
		i = 0;
		for (; i < 13; i++) {
			list3.add(i+1);
		} 
		count = 0;
		i = 0;
		for (; count < n; count++) {
			if (list.get(count).equals("H")) {
				list3.set(list2.get(count) - 1, 0);
			}
		}
		for (; i < 13; i++) {
			if (list3.get(i) != 0) {
				sb.append("H");
				sb.append(" ");
				sb.append(list3.get(i));
				sb.append("\n");
			}
		}
		list3.clear();
		i = 0;
		for (; i < 13; i++) {
			list3.add(i+1);
		} 
		count = 0;
		i = 0;
		for (; count < n; count++) {
			if (list.get(count).equals("C")) {
				list3.set(list2.get(count) - 1, 0);
			}
		}
		for (; i < 13; i++) {
			if (list3.get(i) != 0) {
				sb.append("C");
				sb.append(" ");
				sb.append(list3.get(i));
				sb.append("\n");
			}
		}
		list3.clear();
		i = 0;
		for (; i < 13; i++) {
			list3.add(i+1);
		}
				count = 0;
				i = 0;
				for (; count < n; count++) {
					if (list.get(count).equals("D")) {
						list3.set(list2.get(count) - 1, 0);
					}
				}
				for (; i < 13; i++) {
					if (list3.get(i) != 0) {
						sb.append("D");
						sb.append(" ");
						sb.append(list3.get(i));
						sb.append("\n");
					}
				}
				list3.clear();
				i = 0;
				for (; i < 13; i++) {
					list3.add(i+1);
				}
		System.out.print(new String(sb));
	}
}
