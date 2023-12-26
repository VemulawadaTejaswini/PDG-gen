public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> list = new HashSet<>();		
		int num = scan.nextInt();					
		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}
		System.out.println(list.size());
		scan.close();
	}
}
