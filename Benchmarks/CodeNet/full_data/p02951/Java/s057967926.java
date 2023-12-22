import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
		int ans[] = checkS2(S);
		for(int i = 0 ; i < ans.length; i ++) {
			if(i != 0){
				System.out.print(" ");
			}
			System.out.print(ans[i]);
		}
		System.out.println();
	}


	public int[] checkS2(String S) {
		int ans[] = new int[S.length()];

		int preRpos = 0 ;
		int idxL = 0 ;
		for(int i = 0 ; i < ans.length ; i ++) {
			ans[i] += 1 ;
			char p = S.charAt(i) ;
			char rev = 0 ;
			if(p == 'R') {
				if(idxL <= i) {
					idxL = S.indexOf('L',i + 1);
				}
				preRpos = i ;

				//偶数回後の移動場所
				int pos = 0  ;
				if((idxL - i)%2 == 1) {
					pos = idxL - 1;
				}else {
					pos = idxL ;
				}
				ans[i] -= 1 ;
				ans[pos] += 1 ;
			}else {
				int idx = preRpos ;

				//偶数回後の移動場所
				int pos = 0  ;
				if((i - idx)%2 == 1) {
					pos = idx + 1;
				}else {
					pos = idx ;
				}
				ans[i] -= 1 ;
				ans[pos] += 1 ;
			}
		}
		return ans ;
	}
}
