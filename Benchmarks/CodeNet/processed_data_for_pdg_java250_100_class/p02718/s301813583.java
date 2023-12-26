public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		double totalVote = 0;
		List<Integer> voteList = new ArrayList();
		for(int i = 0; i < N; i++) {
			voteList.add(scan.nextInt());
		}
		Collections.sort(voteList, Collections.reverseOrder());
		for(int i :voteList) {
			totalVote += i;
		}
		if((int)voteList.get(M-1) >= totalVote/(4 * M)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
