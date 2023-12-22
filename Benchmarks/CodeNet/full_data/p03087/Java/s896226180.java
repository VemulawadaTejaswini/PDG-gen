import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();
	    char[] S = s.toCharArray();
		int[][] q = new int[Q][2];
		for(int i=0; i<Q; i++) {
			q[i][0] = sc.nextInt();
			q[i][1] = sc.nextInt();
		}
		
		//文字列Sのn番目の文字がAで、その次の文字がCなら１、そうでなければ０を格納
		int[] isAcList = new int[S.length];
		for(int i=0; i<S.length - 1; i++) {
			if( S[i] == 'A' && S[i+1] == 'C') isAcList[i] = 1;
			else isAcList[i] = 0;
		}
		isAcList[S.length - 1] = 0;
		//累積和
		int[] sum = new int[S.length + 1];
		for(int i=0; i<S.length; i++) {
			sum[i + 1] = sum[i] + isAcList[i];
		} 
		
		for(int i = 0; i<Q; i++) {
			int left = q[i][0] - 1;
			int right = q[i][1];
			int ans = sum[right] - sum[left];
			if (isAcList[right - 1] == 1) ans--;
			System.out.println(ans);
		}
	}
}