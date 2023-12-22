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
//		new C().doIt();
		new D().doIt();
	}
	class A{
		void doIt() {
			int N = sc.nextInt();
			int sum = 0;
			for(int i = 1;i <= N;i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
	}
	class B{
		void doIt() {
			String str = sc.next();
			char ctr[] = str.toCharArray();
			ArrayList<Character> array = new ArrayList<Character>();
			for(int i = 0;i < str.length();i++) {
				if(ctr[i] == 'B') {
					if(array.size() > 0)array.remove(array.size() - 1);
				}else array.add(ctr[i]);
			}
			for(int i = 0;i < array.size();i++)System.out.print(array.get(i));
			System.out.println();
		}
	}
	class C{
		void doIt(){
			int N = sc.nextInt();
			int a[] = new int[N];
			for(int i = 0;i < N;i++)a[i] = sc.nextInt();
			
			int ans = Integer.MAX_VALUE;
			
			for(int i = -100;i <= 100;i++)ans = Math.min(ans, Distance(i,N,a));
			
			System.out.println(ans);
		}
		int Distance(int Pos,int N,int a[]) {
			int sum = 0;
			for(int i = 0;i < N;i++)sum += (Pos - a[i]) * (Pos - a[i]);
			return sum;
		}
	}
	class D{
		void doIt() {
			String str = sc.next();
			char ctr[] = str.toCharArray();
			Check(ctr,str.length());
		}
		void Check(char ctr[],int length) {
			int s = -1;
			int e = -1;
			if(length == 2) {
				if(ctr[0] == ctr[1]) {
					s = 1;e = 2;
				}
			}else {
				for(int i = 0;i < length - 2;i++) {
					if(ctr[i] == ctr[i+1]) {
						s = i+1;e = i+2;
					}
					else if(ctr[i] == ctr[i+2]) {
						s = i+1;e = i+3;
					}
					else if(ctr[i+1] == ctr[i+2]) {
						s = i+2;e = i+3;
					}
				}
			}
			System.out.println(s+" "+e);
			return;
		}
	}
}
