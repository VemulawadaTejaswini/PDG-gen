public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}
		int sumAlice = 0;
		int sumBob   = 0;
		Collections.sort(list, Comparator.reverseOrder());
		for(int i = 0; i < list.size(); i++) {
			if(i % 2 == 0)
				sumAlice += list.get(i);
			else
				sumBob   += list.get(i);
		}
		System.out.println(sumAlice - sumBob);
		scan.close();
	}
}
