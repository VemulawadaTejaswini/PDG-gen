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
		new ABC045().doIt();
	}
	class ABC045{
		long ans = 0;
		void doIt(){
			String str = sc.next();
			int length = str.length();
			dfs(str,length,0,0);
			System.out.println(ans);
		}
		void dfs(String str,int length,int Pos,long sum) {
			for(int i = Pos+1;i <= length;i++) {
				long num = Long.parseLong(str.substring(Pos, i));
				dfs(str,length,i,sum + num);
			}
			if(Pos == length) {
				ans = ans + sum;
			}
		}
	}
}
