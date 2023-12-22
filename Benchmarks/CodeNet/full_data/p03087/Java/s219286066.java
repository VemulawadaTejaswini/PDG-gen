import java.util.*;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[] count = new int[N];
		Arrays.fill(count,0);
		for(int i = 1;i<N;i++) {
			if(S.charAt(i-1)=='A'&&S.charAt(i)=='C') {
				count[i] = count[i-1]+1;
			}else {
				count[i] = count[i-1];
			}
		}
		
		for(int i =0;i<Q;i++) {
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			System.out.println(count[r]-count[l]);
		}
	}
}