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
//		new A().doIt();
//		new B().doIt();
		new C().doIt();
//		new D().doIt();
	}
	class A{
		void doIt(){
			int A[] = new int[3];
			for(int i = 0;i < 3;i++)A[i] = Integer.parseInt(sc.next());
			int five = 0;
			int seven = 0;
			for(int i = 0;i < 3;i++) {
				if(A[i] == 5)five++;
				else if(A[i] == 7)seven++;
			}
			if(five == 2 && seven == 1)System.out.print("YES");
			else System.out.println("NO");
		}
	}
	class B{
		void doIt(){
			int N = sc.nextInt();
			int L = sc.nextInt();
			String str[] = new String[N];
			for(int i = 0;i < N;i++) {
				str[i] = sc.next();
			}
			Arrays.sort(str);
			for(int i = 0;i < N;i++) {
				System.out.print(str[i]);
			}
			System.out.println();
		}
	}
	class C{
		void doIt(){
			int N = sc.nextInt();
			int K = sc.nextInt();
			boolean D[] = new boolean[10];
			for(int i = 0;i < K;i++)D[sc.nextInt()] = true;
			System.out.println(Output(N,D));
		}
		int Output(int N, boolean D[]) {
			for(int i = N;i < 100000;i++) {
				if(D[i % 10])continue;
				if(i >= 10)if(D[(i % 100) / 10])continue;
				if(i >= 100)if(D[(i % 1000) / 100])continue;
				if(i >= 1000)if(D[(i % 10000) / 1000])continue;
				if(i >= 10000)if(D[(i % 100000) / 10000])continue;
				return i;
			}
			return N;
		}
	}
	class D{
		void doIt(){
			
		}
	}
}
