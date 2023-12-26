public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			sc.nextInt();
			sc.nextLine();
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextLine());
			}
			Collections.sort(list);
			for (int i = 0; i < n; i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
		} finally {
			sc.close();
		}
	}
}
