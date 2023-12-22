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
		new B().doIt();
//		new C().doIt();
//		new D().doIt();
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
	}
	class D{
	}
}
