public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n, m, c, sum;
		n = scan.nextInt();
		m = scan.nextInt();
		c = 0;
		sum = 0;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int count = 0; count < (n * m); count++) {
			list1.add(scan.nextInt());
		}
		for (int count2 = 0; count2 < m; count2++) {
			list2.add(scan.nextInt());
		}
		for (int count3 = 0; count3 < (n * m); count3++) {
			sum = sum + list1.get(count3) * list2.get(c);
			if (c == (m-1)) {
				sb.append(sum);
				sb.append("\n");
				sum = 0;
				c = 0;
			}else{
				c++;
			}
		}
		System.out.print(new String(sb));
	}
}
