import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		execute7_1();
	}
	
	private static void execute7_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int M = sc.nextInt();
			int K = sc.nextInt();
			Integer[] m = new Integer[M];
			
			for(int i=0;i<M;i++) {
				m[i]=sc.nextInt();
			}
			
			int range=0;
			
			int lastV=m[0];
			int curV=0;
			for(int i=0; i<K;i++) {
				curV+=m[i];
			}
			int maxV =curV;
			for(int i=K; i<M;i++) {
				curV=curV-lastV+m[i];
				lastV=m[i-K+1];
				if(maxV<curV) {
					maxV=curV;
					range=i-K+1;
				}
			}
			
			double ans = 0;
			
			for(int i=range; i<range+K; i++) {
				ans+=expectV(m[i]);
			}
			System.out.println(ans);
			
		}
	}
	
	private static double expectV(int a) {
		double r = 0;
		for(double i=1;i<=a; i++) {
			r+=i;
		}
		return r/a;
		
	}
}