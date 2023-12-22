import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		char[] line = scn.nextLine().toCharArray();
		char[] c1,c2;
		long ans = 0;
		for(long i = (long)Math.pow(2, N-1);i < Math.pow(2, N*2);i++) {
			if(check(i,N))continue;
			c1 = new char[N];
			c2 = new char[N];
			int count1 = 0,count2 = 0;
			long buf = i;
			for(int j = 0;j < 2*N;j++) {
				if(buf%2 == 1) {
					c1[count1] = line[j];
					count1++;
				}else {
					c2[N-count2-1] = line[j];
					count2++;
				}
				buf /= 2;
			}
			if(yes(c1,c2,N))ans++;

		}

		System.out.println(ans);
		scn.close();
	}

	public static boolean check(long a,int N) {
		int ans = N;
		for(int i = 0;i < 2*N;i++) {
			ans -= a%2;
			a /=2;
			if(ans < 0)return true;
		}
		return ans !=0;
	}
	public static boolean yes(char[] c1,char[] c2,int N) {
		boolean yes = true;
		for(int i = 0;i < N;i++) {
			if(c1[i] != c2[i]) {
				yes = false;
			break;
			}
		}
		return yes;
	}
}
