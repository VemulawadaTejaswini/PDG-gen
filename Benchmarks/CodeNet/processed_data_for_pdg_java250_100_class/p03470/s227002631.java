public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			d.add(stdIn.nextInt());
		}
		Collections.sort(d);
		Collections.reverse(d);
		int ans = 1;
		int base = d.get(0);
		for(int i = 1; i < d.size(); i ++) {
			if(d.get(i) < base) {
				base = d.get(i);
				ans ++;
			}else if(d.get(i) == base){
			}else {
				break;
			}
		}
		System.out.println(ans);
	}
}
