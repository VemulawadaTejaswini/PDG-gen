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
		new A().doIt();
//		new B().doIt();
//		new C().doIt();
//		new D().doIt();
	}
	class A{
		void doIt() {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			int ans = 0;
			if(N <= K)ans = X*N;
			else ans = X*K + Y*(N - K);
			System.out.println(ans);
		}
	}
}
