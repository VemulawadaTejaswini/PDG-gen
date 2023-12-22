import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int D = stdIn.nextInt();
		int E = stdIn.nextInt();
		int F = stdIn.nextInt();
		
		double d = 0;
		double d1 = 0;
		int sum = 0;
		int sug = 0;
		for(int i = 0; 100*A*i <= F; i++) {
			for(int j = 0; 100*A*i+100*B*j <= F; j++) {
				for(int k = 0; 100*A*i+100*B*j+C*k <= F; k++) {
					for(int l = 0; 100*A*i+100*B*j+C*k+D*l <= F; l++) {
						double water = 100*A*i+100*B*j;
						double sugar = C*k+D*l;
						if(100*A*i+100*B*j != 0) {
							d1 = sugar/(water+sugar);
						}
						if((C*k+D*l) <= (A*i+B*j)*E && d1 > d) {
							d = d1;
							sum = 100*A*i+100*B*j+C*k+D*l;
							sug = C*k+D*l;
						}
					}
				}
			}
		}
		System.out.println(sum+ " " + sug);

	}

}