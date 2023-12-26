class Main {
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list, Comparator.reverseOrder());
		for(int i=0;i<3;i++){
			System.out.println(list.get(i));
		}
	}
}
