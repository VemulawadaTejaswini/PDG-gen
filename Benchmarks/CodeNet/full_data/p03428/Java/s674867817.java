
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		
		
		int x[] = new int[n];
		int y[] = new int[n];
		
		for(int i = 0 ; i < n ; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		
		double rr = 1000000000000.0;		
		int result[] = new int[n];
				
		int steps = 1000000;
		for(double rad = 0 ; rad < 2*Math.PI; rad += 2*Math.PI/steps ){	
			double xx = Math.cos(rad) * rr;
			double yy = Math.sin(rad) * rr;
			
			int minI = -1;
			double minD2 = 0;
			for(int i =0 ; i < n ; i++){
				double d2 = (xx - x[i]) * (xx - x[i]) + (yy- y[i])*(yy-y[i]);
				
				if(minI == -1 || minD2 > d2){
					minD2 = d2;
					minI = i;
				}
			}
			result[minI] ++;
		}
		
		for(int i =0 ; i < n ; i++){
			System.out.println((double)result[i]/steps);
		}
		
		
	}
	
	
}
