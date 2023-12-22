
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n=sc.nextInt();
		int[] permutations =new int[n+1]; //Piを入れる配列
		int min=n ;
		int[] mins =new int[n+1];//P1~Piの最小値を保存する配列
		for (int i=1;i<=n;i++) {
			permutations[i] = sc.nextInt();
			if (i==1) {
				min=permutations[1];
			}
			min = Math.min(min,permutations[i]);
			mins[i] =min;
		}
		int ans =0;
		for (int i=1;i<=n;i++) {
			if(permutations[i]==mins[i]) {
				ans ++;
			}
		}
		System.out.println(ans);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//メソッド置き場

	//----------------------------------------
}