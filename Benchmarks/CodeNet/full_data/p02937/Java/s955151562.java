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
		int[] char_s = new int[200];
		int[] char_g = new int[200];
		loop:for (int i=0;i<N_t;i+=0) {
			int i_before = i;
			int before_i=-111;
			for (int j=0;j<N_s;j++) {
				if (t.charAt(i)==s.charAt(j)) {
					i++;

					char_s[(int)t.charAt(i)] = i;
					if (char_g[(int)t.charAt(i)]==i && (char_g[(int)t.charAt(i)]!=0)) {
						break;
					}
					before_i = 0;
					if (i==N_t) {
						index = j;
						break loop;
					}
				} else if (j==N_s-1 && (before_i==i)) {
					char_g[(int)t.charAt(i)] = i;
				}
			}
			// System.out.println(i);
			loop_num++;
			cnt++;
			// if (cnt>= N_t+10) {
			if (i_before == i) {
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