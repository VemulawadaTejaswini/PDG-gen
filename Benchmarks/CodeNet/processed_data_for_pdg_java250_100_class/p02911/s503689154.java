public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();
		int point = sc.nextInt();
		int questions = sc.nextInt();
		int winner[] = new int[questions];
		for(int i=0 ; i<winner.length ; i++) {
			winner[i] = sc.nextInt();
		}
		int result[] = new int[participants];
		Arrays.fill(result, point-questions);
		for(int i=0 ; i<questions ; i++) {
			result[winner[i]-1]++;
		}
		for(int i : result) {
			System.out.println(i>0 ? "Yes" : "No");
		}
		sc.close();
	}
}
