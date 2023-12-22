import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] map = new char[H][W];
		for(int i =0;i < H;i++){
			String xx = sc.next();
			for(int j = 0;j <W;j++){
				map[i][j] = xx.charAt(j);
			}
		}
//		for(int i = 0;i < H;i++){
//			for(int j = 0;j < W;j++){
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
//		
//		
		int[] tate = new int[H];
		for(int i =0;i < H;i++){
			int count = 0;
			for(int j = 0;j <W;j++){
				if(map[i][j] == '.'){
					count++;
				}
			}
			if(count == W){
				tate[i] = 1;
			}
		}	
//		for(int i = 0;i < H;i++){
//			System.out.print(tate[i]);
//		}
//		System.out.println();
		
		int[] yoko = new int[W];
		for(int i =0;i < W;i++){
			int count = 0;
			for(int j = 0;j <H;j++){
				if(map[j][i] == '.'){
					count++;
				}
			}
			if(count == H){
				yoko[i] = 1;
			}
		}
//		for(int i = 0;i < W;i++){
//			System.out.print(yoko[i]);
//		}
//		System.out.println();
		
		for(int i =0;i < H;i++){
			int cc = 0;
			for(int j = 0;j <W;j++){
				if(tate[i]==0){
					if(yoko[j] == 0){
						System.out.print(map[i][j]);
						cc++;
					}
				}
				
			}
			if(cc > 0){
				System.out.println();	
			}

		}


	}


}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

