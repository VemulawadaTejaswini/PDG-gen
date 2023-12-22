import java.awt.Point;
import java.util.*;

public class Main {
	int N;
	List<Point> redPoints;
	List<Point> bluePoints;
	Comparator<Point> comp = new Comparator<Point>() {
		@Override
		public int compare(Point o1, Point o2) {
			if(o1.x*o1.y < o2.x * o2.y) {
				return -1;
			}else if(o1.x * o1.y >o2.x * o2.y) {
				return 1;
			}else {
				return 0;
			}
		}
	};

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		this.redPoints = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			this.redPoints.add(new Point(a, b));
		}
		this.bluePoints = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			int c = in.nextInt();
			int d = in.nextInt();
			this.bluePoints.add(new Point(c, d));
		}
		in.close();
		Collections.sort(this.redPoints, this.comp);
		Collections.sort(this.bluePoints, this.comp);
		// Collections.reverse(this.redPoints);
	}

	int result = 0;

	void calc() {
		for (int i = 0; i < N; ++i) {
			Point bluePoint = this.bluePoints.get(i);
			for (int j = 0; j < this.redPoints.size(); ++j) {
				if (bluePoint.x > this.redPoints.get(j).x && bluePoint.y > this.redPoints.get(j).y) {
//					System.out.println(this.redPoints.get(j).x + ", " + this.redPoints.get(j).y + ", " + bluePoint.x
//							+ ", " + bluePoint.y);
					result++;
					this.redPoints.remove(j);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}
}