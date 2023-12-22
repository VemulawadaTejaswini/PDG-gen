import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String s = scan.next();
		String t = scan.next();

		String S;
		String T;
		int cnt=0;
		for(int i=0;i<N;i++){
			S = s.substring(N-1-i,N-1);
			T = t.substring(0,i);
			if(S.equals(T)){
				cnt = i+1;
		}
		}

		System.out.println(2*N-cnt);


		}

}
