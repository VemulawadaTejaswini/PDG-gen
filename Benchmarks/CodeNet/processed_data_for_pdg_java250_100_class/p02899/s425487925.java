public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		Map<Integer,Integer> hmap = new HashMap<>();
		int hi = 0;
		for (int i=1; i<=N; i++) {
			hmap.put(scan.nextInt(),i);
		}
		int cnt = 0;
		for(int j=1; j<=N; j++) {
			cnt = hmap.get(j);
			String ans = String.valueOf(cnt);
			StringBuilder sb = new StringBuilder(ans);
			sb.append(" ");
			System.out.print(sb);
		}
	}
}
