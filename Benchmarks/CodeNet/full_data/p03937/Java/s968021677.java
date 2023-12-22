import java.util.Scanner;
public class Main {
	static String map[][];
	static int h, w;
	static int memo[][];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		map = new String[h][];
		memo = new int [h][w];
		memo[h-1][w-1] = 1;
		for(int i =0;i < h;i++){
			map[i] = sc.next().split("");
		}
		int x = 0;
		int y = 0;
		while(x != w-1 || y != h-1){
			//System.out.println(x + " "+ y);
			boolean X = false;
			boolean Y = false;
			if(x+1 <= w-1 && map[y][x+1].equals("#")){
				X = true;
			}
			if(y+1 <= h-1 && map[y+1][x].equals("#")){
				Y = true;
			}

			if(X == Y){
				System.out.println("Impossible");
				return;
			}else{
				if(X)x++;
				else y++;
			}
		}
		if(x == w-1 && y == h-1)System.out.println("Possible");
	}

}