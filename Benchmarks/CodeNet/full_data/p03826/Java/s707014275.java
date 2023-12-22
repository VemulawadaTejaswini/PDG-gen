import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		A a = new A();
	}
}

class A {
	
	A() {
		Scanner cin = new Scanner(System.in);
		int A = cin.nextInt();
		int B = cin.nextInt();
		int C = cin.nextInt();
		int D = cin.nextInt();
		int value = Math.max(A*B, C*D);
		System.out.println(value);
	}
	
}
