import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] tmp = new int[n*k];
		for(int i=0;i<n*k;i++)tmp[i]=0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Deque<Integer> deque = new ArrayDeque<>();
		int cnt=0;
		int tmpcnt=0;
		boolean f=true;

		for(int i=0;i<k;i++) {
			for(int j=0;j<n;j++) {
				if(deque.size() == 0) {
					deque.push(a[j]);
					tmp[cnt] = a[j];
					cnt++;
					tmpcnt=cnt;
//					continue;
				} else {
					tmpcnt=cnt;
					for(int h=0;h<tmpcnt;h++) {
						if(tmp[h] == a[j]) {
							while (a[j]!=tmp[cnt]) {
								deque.pop();
								tmp[cnt]=0;
								cnt--;
							};
							tmpcnt=cnt;
							f = false;
						}
					}
					if(f) {
						deque.push(a[j]);
						cnt++;
						tmpcnt=cnt;
					} else {
						f = true;
					}
				}
//				System.err.println(deque);
			}
		}

		if(deque.size()>0) {
			int[] ans = new int[deque.size()];
			int ttt=deque.size();
			for(int i=0;i<deque.size()+1;i++) {
				ans[i] = deque.pop();
			}
			for(int i=ttt-1;i>=0;i--) {
				System.out.println(ans[i]);
			}

		} else {
			System.out.println("");
		}

		sc.close();
	}
}
