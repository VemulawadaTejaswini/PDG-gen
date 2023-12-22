import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String [] ss = s.split("");
		String [] tt = t.split("");
		int x = 0;
		boolean e = true;
		Arrays.sort(ss);
		Arrays.sort(tt, Collections.reverseOrder());
		for(int i = 0; i < ss.length; i++) {
			if(ss[i].compareTo(tt[i]) != 0) {
				e = false;
				x = i;
				break;
			}
		}
			if(ss.length < tt.length && e == true) {
				System.out.println("Yes");
				}
			else if(ss.length == tt.length && e == true) {
				System.out.println("No");
			}
			else if(ss[x].compareTo(tt[x]) < 0) {
				System.out.println("Yes");
				}
			else {
				System.out.println("No");
			}
			sc.close();
	}
}