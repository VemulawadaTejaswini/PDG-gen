import java.util.Scanner;

public class Main {
	static int d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = sc.nextInt();
		point[] points = new point[n];
		for(int i = 0; i < n; i++){
			int[] x = new int[d];
			for(int i2 = 0; i2 < d; i2++){
				x[i2] = sc.nextInt();
			}
			points[i] = new point(x);
		}
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int i2 = i + 1 ; i2 < n; i2++){
				if(points[i].checkGD(points[i2])){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
class point{
	static int d;
	static{
		d = Main.d;
	}
	int[] x;
	point(int... x){
		this.x = x;
	}
	boolean checkGD(point p){
		double dist = 0;
		for(int i = 0; i < d; i++){
			dist += (int)Math.pow(this.x[i] - p.x[i], 2);
		}
		dist = Math.sqrt(dist);
		int idist = (int)dist;
		return (int)(dist * dist * dist * dist) == idist * idist * idist * idist;
//		return dist == dist % 1;
	}
}
