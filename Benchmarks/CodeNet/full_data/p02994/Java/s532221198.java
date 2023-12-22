public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		List<Integer> scores = new ArrayList<>();
		int delicious = scan.nextInt();
		for (int i = 0; i < NUM; i++) {
			scores.add(delicious + i);
		}

		// search
		int sum = 0;
//		Collections.sort(scores, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
		Collections.sort(
				scores, 
	            new Comparator<Integer>() {
	                @Override
	                public int compare(Integer a, Integer b) {
	                    return Math.abs(b) - Math.abs(a);
	                }
	            }
	        );
		scores.remove(0);
		for (Integer integer : scores) {
			sum += integer;
		}

		// answer
		System.out.println(sum);

	}
}