public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> a =new ArrayList<>();
		for(int i=0; i < n; i++) {
			a.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(a, Collections.reverseOrder());
		int alice = 0;
		int bob = 0;
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				alice+=a.get(i);
			}else {
				bob+=a.get(i);
			}
		}
		int dif = alice - bob;
		System.out.println(dif);
	}
}
