import java.util.Scanner;

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	double dist(Point a, Point b) {
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int [] Array = new int[n]; //それぞれの移動距離格納用
		double sumdist = 0;
		
		Point[] point = new Point[n]; //それぞれの街のポイント
		
		for(int i = 0; i < n; i++) {
			point[i] = new Point(stdIn.nextInt(),stdIn.nextInt());
		}
		for(int i = 0; i < point.length-1; i++) {
			sumdist+=point[i].dist(point[i],point[i+1]);
		}
		
		System.out.println((sumdist*2/n));
		

	}

}
