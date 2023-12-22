import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");

		int ans = 0;
		int n = s.length();

		for(int i=0;i<n-2;i++){
			if(S[i].equals("A")&&S[i+1].equals("B")&&S[i+2].equals("C")){
				S[i]="B";
				S[i+1]="C";
				S[i+2]="A";
				ans++;
				int left=0;
				while(i-left-1>-1&&S[i-left-1].equals("A")){
					S[i-left+1]="A";
					ans++;
					left++;
				}
				i++;
			}
		}

		// 出力
		System.out.println(ans);
	}
}