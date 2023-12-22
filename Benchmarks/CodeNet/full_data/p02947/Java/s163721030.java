import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		int n = sc.nextInt();
		String s[] = new String[n];
		char sm[] = new char[10];
		int m[] = new int[n];
		m[0] = 0;
		String sn = sc.next();
		sm = sn.toCharArray();
		Arrays.sort(sm);
		s[0] = new String(sm);
		
		for(int i = 1;i < n;i++) {
			m[i] = 0;
			sn = sc.next();
			sm = sn.toCharArray();
			Arrays.sort(sm);
			s[i] = new String(sm);
			for(int k = 0; k < i;k++) {
				if(s[i].equals(s[k])) {
					m[k]++;
					ans += m[k];
					break;
				}
			}
		}
		System.out.println(ans);

	}

}