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
		new Test_200().doIt();
	}
	class Test_200{
		void doIt() {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int C = sc.nextInt();
			int B[] = new int[M];
			int A[][] = new int[N][M];
			int cnt = 0;
			
			for(int i = 0;i < M;i++)B[i] = sc.nextInt();
			for(int i = 0;i < N;i++) {
				for(int j = 0;j < M;j++) {
					A[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0;i < N;i++) {
				int Cost = C;
				for(int j = 0;j < M;j++) {
					Cost = Cost + A[i][j]*B[j];
				}
				if(Cost > 0)cnt++;
			}
			
			System.out.println(cnt);
		}
	}
}
