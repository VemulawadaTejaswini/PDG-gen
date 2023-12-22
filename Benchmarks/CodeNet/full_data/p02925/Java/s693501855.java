import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final int A[][] = new int[N][N];
		final int R[] = new int[N];
		final int D[] = new int[N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-1;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int cnt=0;
		while(true) {
			for(int i=0;i<N;i++) {
				int a = A[i][R[i]];

				if(a!=0 && A[a - 1][R[a - 1]]==(i+1)) {
					D[i]=1;
				}else {
					D[i]=0;
				}
			}
			cnt++;
			int sum=0;
			for(int i=0;i<N;i++) {
				sum+=D[i];
				R[i]+=D[i];
			}
			boolean hasRemain = false;
			for(int i=0;i<N;i++) {
				if(R[i]!=N-1) {
					hasRemain = true;
					break;
				}
			}
			// すべて終了していれば完了。
			if(!hasRemain) {
				break;
			}
			// 残っているのに、このラウンドで勝負不成立なら達成不可。
			if(hasRemain && sum == 0) {
				cnt=-1;
				break;
			}
			// 残っていて、ラウンドで成立しているなら次へ。
		}


		out.println(cnt);
	}
}
