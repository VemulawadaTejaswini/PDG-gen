import java.util.Scanner;

public class Main {
	static String map[][];
	static int h, w;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		map = new String[h][];
		for(int i = 0;i < h;i++){
			map[i] = sc.next().split("");
		}

		if(search(0,0) == w+h-1){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}

	}

	static int search(int a, int b){
		int res = 0;
		for(int i = 0;i < w;i++){
			for(int j = 0;j < h;j++){
				if(map[i][j].equals("#")){
					res++;
				}
			}
		}
		return res;
	}
}