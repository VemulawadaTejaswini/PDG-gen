import java.util.*;
public class Main {
	int N;
	ArrayList<Integer> result = new ArrayList<Integer>();
	boolean flg = false;
	int[] bnum = new int[100];

	Main(){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		N = sc.nextInt();
		int[] b = new int[N+1];

		for(int n=1;n<=N;n++){
			b[n] = sc.nextInt();
			if(b[n]>n){
				flg = true;
				break;
			} else {
				bnum[b[n]] += 1;
			}
		}

		if(flg){
			System.out.println(-1);
			return;
		}

		// 検証


		// 出力
		if(flg){
			System.out.println(-1);
                } else {
			System.out.println(1);
			for(int n=0;n<N;n++)
				System.out.println(b[N-n]);
		}
	}

	public static void main(String[] args){
		new Main();
	}
}