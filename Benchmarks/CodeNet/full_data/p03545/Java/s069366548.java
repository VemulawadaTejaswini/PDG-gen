import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		int n=3;
		for(int i=0;i<Math.pow(2, n);i++) {
			int[] status = new int[n];
			int sum=Integer.valueOf(s.substring(0,1));
			String res=s.substring(0, 1);
			for(int j=0;j<n;j++) {//iを2進数にした場合にどこの桁が1になっているか判定し、1の場合はstatusに代入
				if((1&i>>j)==1) {
					status[j]=1;
				}
			}
			for(int j=0;j<n;j++) {
				if(status[j]==1) {
					sum+=Integer.valueOf(s.substring(j+1,j+2));
					res+="+";
				}else {
					sum-=Integer.valueOf(s.substring(j+1, j+2));
					res+="-";
				}
				//System.out.println(sum);
				res+=s.substring(j+1, j+2);
			}
			if(sum==7) {
				System.out.println(res+"=7");
				break;
			}
		}

	}
}

