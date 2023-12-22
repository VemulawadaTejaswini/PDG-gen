import java.util.Scanner;

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	static double dist(Point a, Point b) {
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		double sumdist = 0;

		Point[] point = new Point[n]; //それぞれの街のポイント

		for(int i = 0; i < n; i++) {
			point[i] = new Point(stdIn.nextInt(),stdIn.nextInt());
		}
	
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				sumdist += Point.dist(point[i], point[j]);
			}
		}
		
		System.out.println((sumdist*2/n));


	}

}
