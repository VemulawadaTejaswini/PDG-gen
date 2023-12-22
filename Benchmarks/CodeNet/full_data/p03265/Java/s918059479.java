import java.util.Scanner;

class Point{
	double x, y;
	public Point(double _x, double _y){
		x = _x;
		y = _y;
	}
	// add , sub
	public Point add(Point p) {
		return new Point(x + p.x, y + p.y);
	}
	public Point sub(Point p) {
		return new Point(x - p.x, y - p.y);
	}
	public double innerdot(Point p) {
		return p.x * x + p.y * y;
	}
	// rotate d degree
	public Point rotate(double d) {
		double theta = d / 180.0 * Math.PI;
		return new Point(Math.cos(theta) * x  - Math.sin(theta) * y, Math.sin(theta) * x + Math.cos(theta) * y);
	}
}
class Line{
	Point p1, p2;
	public Line(Point _p1, Point _p2){
		p1 = _p1;
		p2 = _p2;
	}
	public Line(double x1, double y1, double x2, double y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}
	public Point Projection(Point p){
		Point Between_p1p2 = p2.sub(p1); //x2, y2
		Point Between_p1p = p1.sub(p); //x1, y1
		double k = Between_p1p.innerdot(Between_p1p2) / Between_p1p2.innerdot(Between_p1p2);
		return new Point(p1.x - k * Between_p1p2.x, p1.y - k * Between_p1p2.y);
	}
	public Point Reflection(Point p) {
		Point t = this.Projection(p);
		Point PX = t.sub(p);
		return p.add(new Point(PX.x * 2.0, PX.y * 2.0));
	}
}


public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
		Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
		Point p3 = new Point(- p2.sub(p1).y + p2.x, p2.sub(p1).x + p2.y);
		Point p4 = p3.add(p1.sub(p2));
		System.out.println((int)p3.x+" "+(int)p3.y+" "+(int)p4.x+" "+(int)p4.y);
	}
}
