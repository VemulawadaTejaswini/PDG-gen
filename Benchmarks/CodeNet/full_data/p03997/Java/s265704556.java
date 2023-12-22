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
			int a = sc.nextInt();
			int b = sc.nextInt();
			int h = sc.nextInt();
			System.out.println((a + b)*h/2);
		}
	}
}
