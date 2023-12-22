import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new ABC109().doIt(); //DFS
	}
	class ABC109{
		int euqulid(int A,int B) {
			if(B > 0)return euqulid(B,A % B);
			else return A;
		}
		void doIt(){
			int n = sc.nextInt();
			int X = sc.nextInt();
			int ans = Integer.MAX_VALUE;
			for(int i = 0;i < n;i++) {
				int x = sc.nextInt();
				int dist = Math.abs(x - X);
				if(i == 0)ans = dist;
				else ans = euqulid(dist,ans);
			}
			System.out.println(ans);
		}
	}
}
