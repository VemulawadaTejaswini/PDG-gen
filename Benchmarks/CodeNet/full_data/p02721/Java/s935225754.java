import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int C = scanner.nextInt();
		String S = scanner.next();

		int[] s = new int[S.length()];

		for(int i=0;i<N;i++) {
			if(String.valueOf(S.charAt(i)).equals("o")) {
				s[i]=1;
			}else {
				s[i]=0;
			}
		}


		int[] ans = new int[N];
		int idx=0;
		//〇を一つづつ×にする
		for(int i=0;i<N;i++) {
			if(s[i]==0) {
				continue;
			}
			s[i]=0;
			//×にしても貪欲に働いた場合、働けるかどうかを判定する


			//1日目から働ける日に働く
			int workDays=0;
			for(int workIdx=0;workIdx<N;workIdx++) {
				//その日に働いた場合
				if(s[workIdx]==1) {
					workIdx+=C;
					workDays++;
					continue;
				}
				//働かなかった場合
			}

			if(workDays<K) {
				//日数を満たせなかった場合、答えに追加して次の日へ
				ans[idx]=i+1;
				idx++;
			}
			//〇に戻しておく
			s[i]=1;
		}
		for(int answer:ans) {
			if(answer!=0) {
				System.out.println(answer);
			}
		}

	}

}
