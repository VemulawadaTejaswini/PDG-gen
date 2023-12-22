import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A =0;
		int nextA =0;
		for(int i=0; i<M ;i++) {
			nextA=sc.nextInt();
			A += nextA;
		}
        int r = N-A;
        if(r<0) {
        	System.out.println(-1);
        }
        else {
        	System.out.println(r);
        }

	}

}
