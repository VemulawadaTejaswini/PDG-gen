import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	int w;
	int h;

	// 白い範囲(x,y)の最大最小値
	int maxX;
	int minX;
	int maxY;
	int minY;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int w = Integer.parseInt(inputs[0]);
		int h = Integer.parseInt(inputs[1]);
		int fillNum = Integer.parseInt(inputs[2]);

		// 塗りつぶし後の白い範囲の最大最小値を得る
		int maxX = w;
		int minX = 0;
		int maxY = h;
		int minY = 0;

		for (int i = 0; i < fillNum; i++) {
			inputs = br.readLine().split(" ");
			int dotX = Integer.parseInt(inputs[0]);
			int dotY = Integer.parseInt(inputs[1]);
			int action = Integer.parseInt(inputs[2]);

			switch (action) {
			case 1:
				if (minX < dotX) {
					minX = dotX;
				}
				break;
			case 2:
				if (maxX > dotX) {
					maxX = dotX;
				}
				break;
			case 3:
				if (minY < dotY) {
					minY = dotY;
				}
				break;
			case 4:
				if (maxY > dotY) {
					maxY = dotY;
				}
				break;
			}
		}
		int resultX = maxX - minX;
		int resultY = maxY - minY;
		int area;
		if (resultX <= 0 || resultY <= 0) {
			area = 0;
		} else {
			area = resultX * resultY;
		}
		System.out.println(area);

	}

}
