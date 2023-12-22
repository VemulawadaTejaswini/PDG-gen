import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		char[][] frame = new char[h + 2][w + 2];
		for(int i = 0; i < frame.length; i++) {
			Arrays.fill(frame[i], '#');
		}
		char[][] picture = new char[h][w];
		for(int i = 0; i < h; i++) {
			picture[i] = sc.next().toCharArray();
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				frame[i + 1][j + 1] = picture[i][j];
			}
		}
		for(int i = 0; i < frame.length; i++) {
			System.out.println(frame[i]);
		}
	}
}