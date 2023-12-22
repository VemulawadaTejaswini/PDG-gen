import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String S = sc.nextLine();
		int countBlack = 0;
		int countWhite = 0;
		int[] B = new int[N+1];
		int[] W = new int[N+1];
		int cursor = 0;
		
		while(cursor <= N){
			for(int i = 0; i < cursor;i++){
				if(S.charAt(i) == '#'){
					countBlack++;
				}
			}
			for(int j = cursor; j < S.length();j++){
				if(S.charAt(j) == '.'){
					countWhite++;
				}
			}
			B[cursor] = countBlack;
			W[cursor] = countWhite;
			countBlack = 0;
			countWhite = 0;
			cursor++;
		}
		
		int cnt = B[0] + W[0];
		for(int k = 0;k < N+1;k++){
			if(B[k] + W[k] < cnt){
				cnt = B[k] + W[k];
			}
		}
		System.out.println(cnt);
	}
}
