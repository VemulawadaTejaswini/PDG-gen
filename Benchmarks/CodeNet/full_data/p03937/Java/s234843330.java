
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] input = new char[h][w];

		for(int i = 0; i < h; i++){
			String str = sc.next();
			for(int j = 0; j < w; j++){
				input[i][j] = str.charAt(j);
			}
		}

		char[][] visit = new char[h][w];
		for(int i = 0; i < h; i++){
			Arrays.fill(visit[i], '.');
		}

		int x = 0;
		int y = 0;

		while(true){
			visit[y][x] = '#';
			if(x == w - 1 && y == h - 1){
				break;
			}

			if(x < w - 1 && input[y][x + 1] == '#'){
				x++;
			}
			else if(y < h - 1 && input[y + 1][x] == '#'){
				y++;
			}
			else{
				break;
			}
		}

		for(int i = 0; i < h; i++){
			for(int j = 0; j < w ; j++){
				if(input[i][j] != visit[i][j]){
					System.out.println("Impossible");
					return;
				}
			}
		}
		System.out.println("Possible");
	}
}
