import java.util.Scanner;
public class Main {
	static String map[][];
	static int h, w;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		map = new String[h][];
		for(int i =0;i < h;i++){
			map[i] = sc.next().split("");
		}
		int x = 0;
		int y = 0;
		while(!(x == w-1 && y == h-1)){
			//System.out.println(x + " "+ y);
			boolean X = false;
			boolean Y = false;
			if(x+1 <= w-1 && map[y][x+1].equals("#")){
				X = true;
			}
			if(y+1 <= h-1 && map[y+1][x].equals("#")){
				Y = true;
			}

			if((X && Y)|| (!X && !Y)){
				System.out.println("Impossible");
				return;
			}else{
				if(X)x++;
				else y++;
			}
		}
		//System.out.println(x + " "+ y);
		System.out.println("Possible");
	}

}
