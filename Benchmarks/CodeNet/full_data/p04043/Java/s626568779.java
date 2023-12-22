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
	}class B{
		void doIt(){
			
		}
	}
	class C{
		void doIt(){
			
		}
	}
	class D{
		void doIt(){
			
		}
	}
}
