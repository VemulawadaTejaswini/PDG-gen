import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		//配列のサイズ入力の受け取り
		Scanner scanner = new Scanner(System.in);
		int length =  Integer.parseInt(scanner.nextLine());
		int width  = Integer.parseInt(scanner.nextLine());
		char[][] map = new char[length+2][width+2];

		//結果の配列準備
		String [][] resultMap = new String[length][width];
		int bombTimes = 0;

		//配列の中身を受付
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int i = 0; i < length ; i++ ) {
				String temp = br.readLine();
				for(int j = 0; j < width ; j++ ) {
				map[i+1][j+1] = temp.charAt(j);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		//判定と結果配列への挿入
		int[] compareX = {-1,0,1,1,1,0,-1,-1};
		int[] compareY = {-1,-1,-1,0,1,1,1,0};
		for(int i = 1; i < length+1; i++ ) {
			for(int j = 1; j < width+1; j++ ) {
				if(map[i][j] == '#') {
					resultMap[i-1][j-1] = "#";
					continue;
				}

				bombTimes = 0;
				for(int k = 0; k < 8; k ++) {
					if(map[i + compareX[k]][j + compareY[k]] == '#') {
						bombTimes++;
					}
				}
				resultMap[i-1][j-1] = String.valueOf(bombTimes);
			}
		}

		//出力
		for(int i = 0; i < length; i++ ) {
			StringBuffer  sb =  new StringBuffer();
			for(int j = 0; j < width; j++ ) {
				sb.append(resultMap[i][j]);
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}
