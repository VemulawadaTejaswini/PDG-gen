import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][]kibou = new int[n][3];
		for(int i=0;i<n;i++) {
			kibou[i][0] = sc.nextInt();
			kibou[i][1] = sc.nextInt();
			int c = 0;
			// 文字列の入力
			String s = sc.next();
			if(s.equals("B")) {
				c = 1;
			}
		kibou[i][2] = c;
		}
		// 文字列の入力
		//String s = sc.next();
		int max_score = 0;
		for(int i=0;i<k;i++) {
			if(max_score==n) {
				break;
			}
			for(int j=0;j<k;j++) {
				int score = 0;
				for(int l=0;l<n;l++) {
					if(((kibou[l][0]+i)/k+(kibou[l][1]+j)/k)%2 == kibou[l][2]) {
						score++;
					}
				}
				score = Math.max(score,n-score);
				max_score = Math.max(score,max_score);
				if(max_score == n) {
					break;
				}
			}
		}
		System.out.println(max_score);
	}
}
