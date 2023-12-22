import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Point> points = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		// スペース区切りの整数の入力
		for(int i = 0; i< n;i++) {
			points.add(new Point(i+1));
		}

		List<Line> lines = new ArrayList<>();
		for(int i = 0; i< m;i++){
			lines.add(new Line (sc.nextInt(), sc.nextInt(), points));
		}
		boolean[] dir = new boolean[m];
		boolean result = dfs(lines, 0);
		if(!result){
			System.out.println("-1");
		} else {
			for (Line line : lines) {
				System.out.println(line);
			}
		}

	}

	private static boolean dfs(List<Line> list, int index){
		if(index == list.size()-1) {
			boolean allEven = true;
			for (Point point : points) {
				if(!point.isEven()){
					allEven = false;
					break;
				}
			}
			return allEven;
		}
		Line line = list.get(index);
		line.setDir(true);
		if(dfs(list, index+1)){
			return true;
		}
		line.setDir(false);
		return dfs(list, index+1);
	}

	private static class Line{ // true >       false <
		private int a = 0;
		private int b = 0;
		private boolean dir = false;
		Line(int a, int b, List<Point> points){
			this.a = a;
			this.b = b;
			points.get(a-1).add(this);
			points.get(b-1).add(this);

		}

		void setDir(boolean dir){
			this.dir = dir;
		}

		@Override
		public String toString(){
			if(dir){
				return a + " " + b;
			}
			return b + " " + a;
		}
	}

	private static class Point{
		private List<Line> lines = new ArrayList<>();
		private int num;
		Point(int num){
			this.num = num;
		}
		public void add(Line line) {
			this.lines.add(line);
		}

		public boolean isEven() {
			int i =0;
			for (Line line : lines) {
				if(line.dir && line.a==this.num){
					i++;
				} else if (!line.dir && line.b ==this.num){
					i++;
				}
			}
			return i%2 ==0;

		}
	}

}