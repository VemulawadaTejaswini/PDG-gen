import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();

		Set<Integer> ws = new HashSet<Integer>();
		for(int i=0; i<=f; i+= 100*a) {
			for(int j=0; j<=f; j+= 100*b) {
				if(i+j != 0 && i+j<=f) {
					ws.add(i+j);
				}
			}
		}
		Set<Integer> ss = new HashSet<Integer>();
		for(int i=0; i<=f; i+= c) {
			for(int j=0; j<=f; j+= d) {
				if(i+j<=f) {
					ss.add(i+j);
				}
			}
		}

		double max=0;
		int ans1=100*a;
		int ans2=0;
		for(int x : ws) {
			for(int y : ss) {
				if(x+y>f) continue;
				if(100.0*y/x<=e && max < 100.0*y/(x+y)) {
					max = 100.0*y/(x+y);
					ans1 = x+y;
					ans2 = y;
				}
			}
		}
		System.out.println(ans1 + " " + ans2);
		sc.close();
	}

}
