import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int kazu[] = new int[N+1];
		boolean flag = true;
		int ans = -1;

		//インクルメント
		for (int i=0; i<=N; i++){
			kazu[i] = -1;
		}

		for(int i = 0; i < M; i++){
			int s = scan.nextInt();
			int c = scan.nextInt();
			if (kazu[s] != -1 && kazu[s] != c ) flag =false;
			if (s == 1 && c == 0)flag = false;
			kazu[s] = c;
		}

		if(flag){
			String str = "";
			for(int i = 1; i <= N; i++){
				if(kazu[i] == -1) {
					kazu[i] = 0;
					if(i == 1 && N != 1)kazu[i] =1 ;
				}
				str += Integer.toString(kazu[i]);
			}
			ans = Integer.parseInt(str);
		}

		System.out.println(ans);
	}
}