import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt()*100;
		int b = in.nextInt()*100;
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		int f = in.nextInt();
		Set<Integer> waters = new HashSet<>();
		int aMax = f/a;
		for(int i=0;i<=aMax;i++) {
			int bMax = (f-a*i)/b;
			for(int j=0;j<=bMax;j++) {
				if(i==0 && j==0) continue;
				waters.add(a*i+b*j);
			}
		}
		
		int ansWater = 0;
		int ansSugar = 0;
		
		double maxrate = -1;
		for(int water:waters) {
			int sugarCapacity = Math.min(f-water, water*e/100);
			int cMax = sugarCapacity/c;
			for(int i=0;i<=cMax;i++) {
				int dMax = (sugarCapacity-c*i)/d;
				double rate = ((double)(c*i+d*dMax))/(water+c*i+d*dMax);
				if(rate>maxrate) {
					maxrate = rate;
					ansWater = water;
					ansSugar = c*i+d*dMax;
				}
			}
		}
		
		System.out.println((ansWater+ansSugar)+" "+ansSugar);
		in.close();
	}

}
