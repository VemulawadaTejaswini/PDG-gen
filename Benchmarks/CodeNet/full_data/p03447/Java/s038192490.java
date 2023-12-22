import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println( solve(x,a,b) );
	}
	
	int solve(int x,int a,int b){
		return (x-a)%b;
	}
}
