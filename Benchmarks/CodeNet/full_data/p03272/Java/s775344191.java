import java.util.Scanner;
public class Main {
	int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}
	
	void test(Scanner sc){
		int N = sc.nextInt();
		int i=sc.nextInt();
		int out = N+1-i;
		System.out.println(out);
	}
}
