import java.awt.Point;
import java.util.Scanner;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		Point p=new Point();
		int n=s.nextInt(),t=0;
		for(int i=0;i<n;++i) {
			int dt=-t+(t=s.nextInt()),d=d(p,p=new Point(s.nextInt(),s.nextInt()));
			if(dt<d||(dt-d)%2==1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	static int d(Point f,Point t) {
		return Math.abs(f.x-t.x)+Math.abs(f.y-t.y);
	}
}