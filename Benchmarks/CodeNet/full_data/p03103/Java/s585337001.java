import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long[][] x = new long[N][2];
		for (int i=0;i<N;i++) {
			for (int j=0;j<2;j++) {
				x[i][j]=sc.nextLong();
			}
		}
		Arrays.sort(x,Comparator.comparingLong(o -> o[0]));
		int num=0;
		Long cost=(long)0;
		while (M>0) {
			if (M>=x[num][1]) {
				M=M-x[num][1];
				cost=cost+x[num][0]*x[num][1];
				num++;
			}else {
				break;
			}
		}
		if (M>0) {
			cost=cost+x[num][0]*M;
		}
		System.out.println(cost);
	}
}