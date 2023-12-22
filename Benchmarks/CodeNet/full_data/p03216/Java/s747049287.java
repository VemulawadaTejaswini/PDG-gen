import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static int[] qlist;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int q = sc.nextInt();
		ArrayList<Integer> dindex = new ArrayList<Integer>(n);
		ArrayList<Integer> betweenM = new ArrayList<Integer>(n);
		qlist = new int[q];
		int dcnt = 0,dmcnt = 0,dpoint = 0,cnt = 0,mcnt = 0,btwpoint = 0;
		boolean dflag = false,dmflag = false,bewflag = false;
		for(int i = 0;i < q;i++) {
			qlist[i] = sc.nextInt();
		}
		for(int j = 0;j < q;j++) {
			cnt = 0;
			dmcnt = 0;
			dcnt = 0;
			dpoint = 0;
			mcnt = 0;
			btwpoint = 0;
			dflag = false;
			dmflag = false;
			bewflag = false;
			for(int i = 0;i < n;i++) {
				if(s[i] == 'D') {
					dindex.add(i);
					dcnt++;
					dflag = true;
					if(dmflag == true) {
						bewflag = true;
						betweenM.add(mcnt);
					}
				}
				else if(s[i] == 'M' && dflag == true) {
					mcnt++;
					dmcnt += dcnt;
					dmflag = true;
				}
				if(dmflag == true && i - dindex.get(dpoint) >= qlist[j]) {
					//System.out.println(dmcnt);
					dpoint++;
					dmcnt -= mcnt;
					if(bewflag == true) {
						mcnt -= betweenM.get(btwpoint);
						btwpoint++;
					}
					dcnt--;

					if(dcnt == 0 || mcnt == 0) {
						dmflag = false;
						dflag = false;
						bewflag = false;
					}
				}
				if(s[i] == 'C' && dmflag == true) {
					cnt += dmcnt;
				}
			}
			System.out.println(cnt);
		}

	}
}