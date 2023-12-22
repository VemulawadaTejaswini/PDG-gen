import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[] Num = new int[M];
		for (int i = 0; i < M; i++) {
			Num[i] = scn.nextInt();
		}
		Arrays.sort(Num);
		int[] numnum = { 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		NumSet.setNum(Num);


		NumSet[] DP = new NumSet[N+1];
		for(int i = 0;i <= N;i++) {
			for(int j = 0;j <= Math.min(N/2, 30)/2;j++) {
				if(DP[j] != null && DP[i-j] != null) {
					if(DP[i] == null) {
						DP[i] = new NumSet(DP[j], DP[i-j]);
					}else {
						DP[i] = NumSet.max(new NumSet(DP[j], DP[i-j]), DP[i]);
					}
				}
			}
			if(DP[i] == null) {
				for(int j = Num.length-1;j > -1;j--) {
					if(i == numnum[Num[j]-1]) {
						DP[i] = new NumSet(j);
						 break;
					}
				}
			}
		}
		System.out.println(DP[N]);

	}

}

class NumSet{
	static int[] num;
	int[] num_num;
	public NumSet(NumSet N1, NumSet N2) {
		num_num = marge(N1, N2);
	}

	public NumSet(int j) {
		num_num = new int[num.length];
		num_num[j]++;
	}

	int[] getNum(){
		return this.num;
	}

	int[] getNumNum() {
		return this.num_num;
	}

	int getSize() {
		int size = 0;
		for(int i:num_num) {
			size+= i;
		}
		return size;
	}

	int[] marge(NumSet N1, NumSet N2) {
		int[] n1 = N1.getNumNum(), n2 = N2.getNumNum();
		int length = n1.length;
		int[] merge_num_num = new int[length];
		for(int i = 0;i < length;i++) {
			merge_num_num[i] = n1[i] + n2[i];
		}
		return merge_num_num;
	}

	static void setNum(int[] Num) {
		num = Num;
	}

	static NumSet max(NumSet N1, NumSet N2) {
		if(N1.getSize() > N2.getSize()) {
			return N1;
		}
		if(N1.getSize() < N2.getSize()) {
			return N2;
		}
		int length = num.length;
		int[] n1 = N1.getNumNum();
		int[] n2 = N2.getNumNum();
		for(int i = length-1;i > -1;i--) {
			if(n1[i] > n2[i])return N1;
			if(n1[i] < n2[i])return N2;
		}
		return N1;
	}

	public String toString() {
		String str = "";
		for(int i = num.length-1;i > -1;i--) {
			for(int j = 0;j < num_num[i];j++) {
				str += num[i];
			}
		}
		return str;
	}
}
