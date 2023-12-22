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
		m.add(0);
		String sn = sc.next();
		sm = sn.toCharArray();
		Arrays.sort(sm);
		s.add(new String(sm));
		
		for(int i = 1;i < n;i++) {
			sn = sc.next();
			sm = sn.toCharArray();
			Arrays.sort(sm);
			si = new String(sm);
			if(s.indexOf(si) == -1) {
				s.add(si);
				m.add(0);
			}else {
				int memo = s.indexOf(si);
				int memo_s = m.get(memo) + 1;
				m.set(memo, memo_s);
				ans += m.get(memo);
			}
		}
		System.out.println(ans);

	}

}
