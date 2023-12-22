import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String[] Sdata = new String[S.length()];
		Sdata = S.split("");
		String[] Tdata = new String[T.length()];
		Tdata = T.split("");
		int flg = 0;
		for(int i = 0;i < S.length();i ++) {
			int ccnt = 0;
			/*for(int k = 0;k < S.length();k ++) {
				System.out.print(Sdata[k]);
			}
			System.out.println();
			for(int k = 0;k < S.length();k ++) {
				System.out.print(Tdata[k]);
			}
			System.out.println();*/
			for(int k = 0;k < S.length();k ++) {
				if(Sdata[k].equals(Tdata[k])) ccnt++;
			}
			//System.out.println(ccnt);
			if(ccnt == S.length()) {System.out.println("Yes"); flg = 1;break;}
			char[] clast = Sdata[S.length() - 1].toCharArray();
			for(int k = S.length() - 1;k > 0;k --) {
				Sdata[k] = Sdata[k-1];
			}
			Sdata[0] = String.valueOf(clast[0]);
		}
		if(flg == 0)System.out.println("No");
	}
}
