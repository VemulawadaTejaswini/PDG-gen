import java.util.Scanner;

class Main{
	static long[] numdata;
	static int[][] box;					//黒マスmap
	static boolean[][] mark;
	static int H;
	static int W;
	static int N;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		H = sc.nextInt();
		W = sc.nextInt();
		N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];

		box = new int[W+1][H+1];
		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt();			//y
			b[i] = sc.nextInt();		//x
			box[b[i]][a[i]]++;
		}

//		for(int i = H;i >= 1;i--){
//			for(int j = 1;j <= W;j++){
//				System.out.print(box[j][i]);
//			}
//			System.out.println();
//		}
//		System.out.println();


		numdata = new long[10];
		mark = new boolean[W+1][H+1];
		for(int i = 0;i < N;i++){
//			System.out.println(i+"番目");
			check(b[i],a[i]);
		}

		for(int i = 0;i < 10;i++){
			System.out.println(numdata[i]);
		}


	}
	
	


	static void check(int x,int y){				//黒ますの周辺について9通り調べる

		boolean can = true;

		int count = 0;
		for(int dx = 0;dx < 3;dx++){				//黒マスが左下
			int nx = x + dx;
			for(int dy = 0;dy < 3;dy++){
				int ny = y + dy;
				if(can ){
					if(nx >= 0 && nx <= W && ny >= 0 && ny <= H){
						if( box[nx][ny] > 0){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can  && !(mark[x+1][y+1])){
			numdata[count]++;	
			mark[x + 1][y + 1] = true;			//中央をmark
		}
//		System.out.println("左下");
//		System.out.println(can);
//		System.out.println(count);


		can = true;
		count = 0;

		for(int dx = -1;dx < 2;dx++){				//黒マスが真ん中下
			int nx = x + dx;
			for(int dy = 0;dy < 3;dy++){
				int ny = y + dy;
				if(can){
					if(nx >= 1 && nx <= W && ny >= 1 && ny <= H ){
						if( box[nx][ny] > 0 ){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can && !(mark[x][y+1])){
			numdata[count]++;	
			mark[x][y + 1] = true;			//中央をmark
		}
//		System.out.println("真ん中下");
//		System.out.println(can);
//		System.out.println(count);
		can = true;
		count = 0;
		


		for(int dx = -2;dx < 1;dx++){				//黒マスが右下
			int nx = x + dx;
			for(int dy = 0;dy < 3;dy++){
				int ny = y + dy;
				if(can ){
					if(nx >= 1 && nx <= W && ny >= 1 && ny <= H){
						if( box[nx][ny] > 0 ){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can && !(mark[x - 1][y+1])){
			numdata[count]++;	
			mark[x-1][y + 1] = true;			//中央をmark
		}

//		System.out.println("右下");
//		System.out.println(can);
//		System.out.println(count);
		can = true;
		count = 0;
		


		for(int dx = 0;dx < 3;dx++){				//黒マスが左真ん中
			int nx = x + dx;
			for(int dy = -1;dy < 2;dy++){
				int ny = y + dy;
				if(can ){
					if(nx >= 1 && nx <= W && ny >= 1 && ny <= H){
						if( box[nx][ny] > 0  ){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can && !(mark[x + 1][y])){
			numdata[count]++;	
			mark[x + 1][y] = true;			//中央をmark
		}
//		System.out.println("左真ん中");
//		System.out.println(can);
//		System.out.println(count);

		can = true;
		count = 0;


		for(int dx = -1;dx < 2;dx++){				//黒マスが真ん中
			int nx = x + dx;
			for(int dy = -1;dy < 2;dy++){
				int ny = y + dy;
				if(can){
					if(nx >= 1 && nx <= W && ny >= 1 && ny <= H){
						if( box[nx][ny] > 0 ){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can  && !(mark[x][y])){
			numdata[count]++;	
			mark[x][y] = true;			//中央をmark
		}
//		System.out.println("真ん中");
//		System.out.println(can);
//		System.out.println(count);
		can = true;
		count = 0;


		for(int dx = -2;dx < 1;dx++){				//黒マスが右真ん中
			int nx = x + dx;
			for(int dy = -1;dy < 2;dy++){
				int ny = y + dy;
				if(can ){
					if(nx >= 1 && nx <= W && ny >= 1 && ny <= H){
						if( box[nx][ny] > 0){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can && !(mark[x-1][y])){
			numdata[count]++;	
			mark[x - 1][y] = true;			//中央をmark
		}
//		System.out.println("真ん中右");
//		System.out.println(can);
//		System.out.println(count);
		can = true;
		count = 0;


		for(int dx = 0;dx < 3;dx++){				//黒マスが左上
			int nx = x + dx;
			for(int dy = -2;dy < 1;dy++){
				int ny = y + dy;
				if(can ){
					if(nx >= 1 && nx <= W && ny >= 1 && ny <= H){
						if( box[nx][ny] > 0){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can && !(mark[x + 1][y -1])){
			numdata[count]++;	
			mark[x + 1][y - 1] = true;			//中央をmark
		}
//		System.out.println("左上");
//		System.out.println(can);
//		System.out.println(count);

		can = true;
		count = 0;


		for(int dx = -1;dx < 2;dx++){				//黒マスが真ん中上
			int nx = x + dx;
			for(int dy = -2;dy < 1;dy++){
				int ny = y + dy;
				if(can ){
					if(nx >= 1 && nx <= W && ny >= 1 && ny <= H){
						if( box[nx][ny] > 0  ){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can && !(mark[x][y-1])){
			numdata[count]++;	
			mark[x][y - 1] = true;			//中央をmark
		}
//		System.out.println("真ん中上");
//		System.out.println(can);
//		System.out.println(count);
		can = true;
		count = 0;

		for(int dx = -2;dx < 1;dx++){				//黒マスが右上
			int nx = x + dx;
			for(int dy = -2;dy < 1;dy++){
				int ny = y + dy;
				if(can){
					if(nx >= 1 && nx <= W && ny >= 1 && ny <= H){
						if( box[nx][ny] > 0 ){
							count++;
						}
					}else{
						can = false;
						break;
					}
				}
			}
		}
		if(can  && !(mark[x-1][y-1])){
			numdata[count]++;	
			mark[x - 1][y - 1] = true;			//中央をmark
		}
//		System.out.println("右上");
//		System.out.println(can);
//		System.out.println(count);
//		System.out.println();
		can = true;
		count = 0;


	}
}