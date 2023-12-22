import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final char BLACK = '#';
	static final char WHITE = '.';

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String[] tmpArray = br.readLine().split(" ");

		int a = Integer.parseInt(tmpArray[0]);
		int b = Integer.parseInt(tmpArray[1]);

		int h = 2*Math.max(a, b);
		int w = 100;

//		if(a == b){

		char[][] matrix = new char[h][w];

		System.out.println(h+" "+w);
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w ; j++){
				if(i % 2 == 0){
//					System.out.print(BLACK);
					matrix[i][j] = BLACK;
				}
				else {
					matrix[i][j] = WHITE;
				}
			}
		}


		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
//		System.out.println();
//		}

	}

}
