class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList();
		list.add(A+B);
		list.add(A-B);
		list.add(A*B);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list.get(0));
	}
}
