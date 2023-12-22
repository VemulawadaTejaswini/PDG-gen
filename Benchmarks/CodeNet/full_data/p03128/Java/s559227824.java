import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[m][2];
		int[] min = new int[2];
		min[1] = 8;
		for(int i=0;i<m;i++) {
			a[i][0] = in.nextInt();
			if(a[i][0]==1) a[i][1] = 2;
			else if(a[i][0]==7) a[i][1] = 3;
			else if(a[i][0]==4) a[i][1] = 4;
			else if(a[i][0]==2 || a[i][0]==3 || a[i][0]==5) a[i][1] = 5;
			else if(a[i][0]==6 || a[i][0]==9) a[i][1] = 6;
			else a[i][1] = 7;
			if(a[i][1]<min[1]) {
				min[0] = a[i][0];
				min[1] = a[i][1];
			}
		}
		if(n%min[1]==0) {
			String ans = "";
			for(int i=0;i<n/min[1];i++) {
				ans += min[0];
			}
			System.out.println(ans);
		}else {
			List<int[][]> list = new ArrayList<>();
			for(int i=0;i<m;i++) {
				if(gcd(min[1],a[i][1])==1) {
					int[][] tmp = new int[2][2];
					tmp[0][0] = min[0];
					tmp[1][0] = a[i][0];
					int tmp_n = n;
					int digit = 0;
					while(tmp_n%min[1]!=0) {
						tmp_n -= a[i][1];
						digit++;
					}
					tmp[0][1] = tmp_n/min[1];
					tmp[1][1] = digit;
					list.add(tmp);
				}else {
					//continue
				}
			}
			int[][] max = new int[2][2];
			for(int i=0;i<list.size();i++) {
				int[][] tmp = list.get(i);
				if(tmp[0][1]+tmp[1][1]>max[0][1]+max[1][1]) max = tmp;
				else if(tmp[0][1]+tmp[1][1]==max[0][1]+max[1][1]) {
					int max_larger = Math.max(max[0][0], max[1][0]);
					int tmp_larger = Math.max(tmp[0][0], tmp[1][0]);
					if(tmp_larger>max_larger) max = tmp;
					else if(tmp_larger==max_larger) {
						int max_larger_digit = max[0][0]>max[1][0]?max[0][1]:max[1][1];
						int tmp_larger_digit = tmp[0][0]>tmp[1][0]?tmp[0][1]:tmp[1][1];
						if(tmp_larger_digit>max_larger_digit) max = tmp;
						else if(tmp_larger_digit==max_larger_digit) {
							int max_smaller = Math.min(max[0][0], max[1][0]);
							int tmp_smaller = Math.min(tmp[0][0], tmp[1][0]);
							if(tmp_smaller>max_smaller) max = tmp;
						}
					}
				}
			}
			int larger = max[0][0]>max[1][0]?0:1;
			int smaller = max[0][0]<max[1][0]?0:1;
			String ans = "";
			if(max[larger][0]!=5) {
				for(int i=0;i<max[larger][1];i++) ans += max[larger][0];
			}else {
				for(int i=0;i<max[larger][1]/2;i++) ans += "6";
				ans += max[larger][1]%2==0?"":"5";
				for(int i=0;i<max[larger][1]/2;i++) ans += "4";
			}
			if(max[smaller][0]!=5) {
				for(int i=0;i<max[smaller][1];i++) ans += max[smaller][0];
			}else {
				for(int i=0;i<max[smaller][1]/2;i++) ans += "6";
				ans += max[smaller][1]%2==0?"":"5";
				for(int i=0;i<max[smaller][1]/2;i++) ans += "4";
			}
			
			System.out.println(ans);
		}
		in.close();
	}
	
	public static int gcd(int a,int b) {
		if(b==0) return a;
		else return gcd(b,a%b);
	}

}
