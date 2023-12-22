import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String tar[] = {"Female", "Male", "Vacant"};
		int l = 0, r = n - 1;
		int m = (r + l) / 2;
		System.out.println(0);
		String s = sc.next();
		if(s.equals(tar[1])) {
			String tmp = tar[0];
			tar[0] = tar[1];
			tar[1] = tmp;
		}
		if (!s.equals(tar[2])) {
			while (l + 1 < r) {
				m = (r + l) / 2;
				System.out.println(m);
				s = sc.next();
				if(s.equals(tar[2]))break;
				else if(s.equals(tar[m % 2]))l = m;
				else r = m;
			}
			System.out.println(r);
		}
		sc.close();
	}

}
