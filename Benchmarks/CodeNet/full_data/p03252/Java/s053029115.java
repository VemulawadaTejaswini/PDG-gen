import java.util.Scanner;
public class Main {
	static int[][] ssame = new int[200000][2];
	static int[][] tsame = new int[200000][2];
	//static ArrayList
	static int cnt = 0,scnt = 0,tcnt = 0,sidx = 0,tidx = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		count(s,t);
		//judge();
	}
	static void count(String s1,String s2) {
		int i,k;
		for(i = 0;i < s1.length();i++) {
			for(k = i+1;k < s1.length();k++) {
				if(s1.charAt(i) == s1.charAt(k)) {
					cnt++;
					if(s2.charAt(i) == s2.charAt(k)) {
						scnt++;
					}
				}
			}
		}
		if(cnt == scnt && scnt != 0) System.out.println("Yes");
		else {
			for(i = 0;i < s2.length();i++) {
				for(k = i+1;k < s2.length();k++) {
					if(s2.charAt(i) == s2.charAt(k)) {
						tcnt++;
					}
				}
			}
			if(cnt == 0 && tcnt == 0) System.out.println("Yes");
			else System.out.println("No");
		}
	}
	/*static void count(String s) {
		int i,k;
		for(i = 0;i < s.length();i++) {
			for(k = i+1;k < s.length();k++) {
				if(s.charAt(i) == s.charAt(k)) {
					if(cnt == 0) {
						ssame[sidx][0] = i; ssame[sidx][1] = k;
						sidx++;
					}else {
						tsame[tidx][0] = i; tsame[tidx][1] = k;
						tidx++;
					}
				}
			}
		}
	}
	static void judge() {
		if(sidx == 0 && tidx == 0 || sidx == tidx) System.out.println("Yes");
		else {
			int i,k,samecnt = 0;
			for(i = 0;i < sidx;i ++) {
				for(k = 0;k < tidx;k ++) {
					if(ssame[i][0] == tsame[k][0] && ssame[i][1] == tsame[k][1]) {
						samecnt++;
					}
				}
			}
			if(samecnt == sidx && samecnt != 0) System.out.println("Yes");
			else System.out.println("No");
		}
	}*/
}