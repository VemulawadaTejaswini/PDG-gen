import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		Student[] students = new Student[N];
		CheckPoint[] check_points = new CheckPoint[M];

		for(int i = 0; i < students.length; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			students[i] = new Student(a, b);
		}
		for(int i = 0; i < check_points.length; i++){
			int c = sc.nextInt();
			int d = sc.nextInt();
			check_points[i] = new CheckPoint(c, d);
		}

		for(Student st: students){
			st.SetDestination(check_points);
		}
		for(Student st: students){
			System.out.println(st.Destination);
		}

		sc.close();
	}

}

class Student {
	Point Position;
	int Destination;

	Student(int a, int b){
		Position = new Point(a, b);
	}

	void SetDestination(CheckPoint[] cpts){
		int mindist = Integer.MAX_VALUE;
		for(CheckPoint c: cpts){
			int dist = Distance.Manhattan(this.Position, c.Position);
			if(dist < mindist){
				Destination = c.Id;
				mindist = dist;
			}
		}
	}
}

class CheckPoint {
	static int InitId = 1;

	int Id;
	Point Position;

	CheckPoint(int c, int d){
		Id = InitId;
		InitId++;
		Position = new Point(c, d);
	}
}

class Distance {
	static int Manhattan(Point a, Point b){
		return Math.abs(a.X - b.X) + Math.abs(a.Y - b.Y);
	}
}

class Point {
	int X;
	int Y;

	Point(int x, int y){
		X = x;
		Y = y;
	}
}