import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new Test_300().doIt();
	}
	class Test_300{
		void doIt() {
			int N = sc.nextInt();
			int F[] = new int [N];
			int P[][] = new int [N+1][11];
			int ans = 0;
			
			for(int i = 0;i < N;i++) {
				int cnt = 0;
				for(int j = 0;j < 10;j++) {
					cnt = cnt + sc.nextInt();
				}
				F[i] = cnt;
			}
			boolean check = false;
			int sa = 40000001;
			for(int i = 0;i < N;i++) {
				int max = -20000001;
				for(int j = 0;j < 11;j++) {
					P[i][j] = sc.nextInt();
					if(j <= F[i]) {
						if(j > 0) {
							sa = Math.min(sa, P[i][0] - P[i][j]);
							if(max < P[i][j]) {
								check = true;
							}
						}
						max = Math.max(max, P[i][j]);
					}
				}
				ans = ans + max;
			}
			if(!check)ans = ans - sa;
			System.out.println(ans);
		}
	}
}
