import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();// 学生の数
		int M = scanner.nextInt();// チェックポイント数
		List<Pos> studentList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			// i番目の学生の位置 (a, b)
			studentList.add(new Pos(scanner.nextInt(), scanner.nextInt()));
		}
		List<Pos> checkPointList = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			// i番目のチェックポイントの位置 (c, d)
			checkPointList.add(new Pos(scanner.nextInt(), scanner.nextInt()));
		}
		for (Pos stupos : studentList) {
			int checknum = 0;
			int min = stupos.distance(checkPointList.get(0));
			for (int i = 1; i < checkPointList.size(); i++) {
				int dis = stupos.distance(checkPointList.get(i));
				if (dis < min) {
					min = dis;
					checknum = i;
				}
			}
			System.out.println(checknum + 1);
		}
	}
	public static class Pos {
		int x;
		int y;
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int distance(Pos o) {
			return Math.abs(this.x - o.x) + Math.abs(this.y - o.y);
		}
	}
}
