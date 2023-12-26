public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();		
		int num = scan.nextInt();					
		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}
		long count = list.stream().distinct().count();
		System.out.println(count);
		scan.close();
	}
}
