import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] abc = new int[3];
		for(int i=0;i<3;i++) {
			abc[i] = in.nextInt();
		}
		int[] l = new int[n];
		int num = 1;
		for(int i=0;i<n;i++) {
			l[i] = in.nextInt();
			num *= 4;
		}
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<num;i++) {
			int[] tmp_l = new int[3];
			int mod = 1;
			int tmp_ans = 0;
			for(int j=0;j<n;j++) {
				if((i/mod)%4==0) {
					if(tmp_l[0]!=0) tmp_ans += 10;
					tmp_l[0] += l[j];
				}
				else if((i/mod)%4==1) {
					if(tmp_l[1]!=0) tmp_ans += 10;
					tmp_l[1] += l[j];
				}
				else if((i/mod)%4==2) {
					if(tmp_l[2]!=0) tmp_ans += 10;
					tmp_l[2] += l[j];
				}
				mod *= 4;
			}
			if(tmp_l[0]==0 || tmp_l[1]==0 || tmp_l[2]==0) {
				//continue;
			}else {
				tmp_ans += Math.abs(abc[0]-tmp_l[0]) + Math.abs(abc[1]-tmp_l[1]) + Math.abs(abc[2]-tmp_l[2]);
				if(tmp_ans<ans) ans = tmp_ans;
			}
		}
		System.out.println(ans);
		in.close();

	}

}
