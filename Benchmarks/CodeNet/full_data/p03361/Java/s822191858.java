import java.util.Scanner;
// import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] scan = scanner.nextLine().split(" ");
		int h = Integer.parseInt(scan[0]);
		int w = Integer.parseInt(scan[1]);
		String[][] map = new String[h][w];
		for(int i = 0; i < h; i++) {
			map[i] = scanner.nextLine().split("");
		}
		scanner.close();
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				boolean able = false;
				if(map[i][j].equals("#")) {
					if(i > 0 && map[i - 1][j].equals("#")) able = true;
					if(i < map.length - 1 && map[i + 1][j].equals("#")) able = true;
					if(j > 0 && map[i][j - 1].equals("#")) able = true;
					if(j < map[i].length - 1&& map[i][j + 1].equals("#")) able = true;
					if(!able) {
						System.out.println("NO");
						return;
					}
				}
			}
		}
		System.out.println("YES");
	}
}
