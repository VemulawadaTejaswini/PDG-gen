public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i=0;i<m;i++) {
			a.add(scan.nextInt());
		}
		int countEast = 0;
		for(int i=x;i<=n;i++) {
			if(a.contains(i)) {
				countEast++;
			}
		}
		int countWest = 0;
		for(int i=x;i>=0;i--) {
			if(a.contains(i)) {
				countWest++;
			}
		}
		System.out.println(Math.min(countEast, countWest));
	}
}
