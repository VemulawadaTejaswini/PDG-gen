import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		int n = sc.nextInt();
		List<String> s = new ArrayList<>();
		String si;
		char sm[] = new char[10];
		List<Integer> m = new ArrayList<>();
		String sn;
		
		for(int i = 0;i < n;i++) {
			sn = sc.next();
			sm = sn.toCharArray();
			Arrays.sort(sm);
			si = new String(sm);
			if(s.indexOf(si) == -1) {
				s.add(si);
				m.add(0);
			}else {
				int memo_s = m.get(s.indexOf(si)) + 1;
				m.set(s.indexOf(si), memo_s);
				ans += memo_s;
			}
		}
		System.out.println(ans);
	}
}
