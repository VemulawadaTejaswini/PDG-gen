import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int N_s = s.length();
		int N_t = t.length();

		int loop_num=0;
		int index=0;
		int flag=0;
		int cnt = 0;
		loop:for (int i=0;i<N_t;i+=0) {
			for (int j=0;j<N_s;j++) {
				if (t.charAt(i)==s.charAt(j)) {
					i++;
					if (i==N_t) {
						index = j;
						break loop;
					}
				}
			}
			// System.out.println(i);
			loop_num++;
			cnt++;
			if (cnt>= N_t+10) {
				flag = 1;
				break;
			}
		}
		// System.out.println(loop_num);
		// System.out.println(index);
		if (flag==1) {
			System.out.println(-1);
		} else {
			System.out.println((long)loop_num * (long)N_s + (long)index + 1L);
		}
	}
}