import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] ss = s.split("");
		
		String t = sc.next();
		String[] tt = t.split("");
		
		int curs = 0;
		int curt = 0;
		
		while(curs<ss.length && curt<tt.length) {
			if(ss[curs].equals(tt[curt])) {
				curs++;
				curt++;
			}else {
				String tmp = tt[curt];
				for(int i=curt+1; i<tt.length; i++) {
					if(tt[i].equals(tmp)) {
						if(!ss[i].equals(ss[curs])) {
							System.out.println("NO");
							return;
						}else {
							ss[curs] = tt[curt];
							ss[i] = tt[curt];
						}
					}else {
						ss[curs] = tt[curt];
					}
				}
				curs++;
				curt++;
			}
		}
		if(curs == ss.length) {
			System.out.println("YES");
		}
	}
}
