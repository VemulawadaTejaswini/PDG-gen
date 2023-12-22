import java.util.*;

class Main{
	

	public static ArrayList<Log> logs = new ArrayList<>();


	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();

		boolean map[][] = new boolean[H][W];

		int rem = 0;

		for(int h=0;h<H;h++){
			for(int w=0;w<W;w++){
				int c = sc.nextInt();
				if(c%2==0) map[h][w] = true;
				else{
				 map[h][w] = false;
				 rem++;
				}
			}
		}

		int rem_x = -1;
		int rem_y = -1;
		int p_x = -1;
		int p_y = -1;

		for(int h=0;h<H;h++){
			if(rem < 2) break;
			if(h%2==0){
				for(int w=0;w<W;w++){

					if(!(rem_x == -1 && rem_y == -1)){
						logs.add(new Log(p_y,p_x,h,w));
					}
					if(!map[h][w]){
						if(rem_x == -1 && rem_y == -1){
							rem_x = w;
							rem_y = h;
							p_x = rem_x;
							p_y = rem_y;
						}else{
							map[rem_y][rem_x] = false;
							map[h][w] = false;
							rem -= 2;
							rem_x = -1;
							rem_y = -1;
						}
					}
					p_x = w;
					p_y = h;
				}

			}else{
				for(int w=W-1;w>=0;w--){

					if(!(rem_x == -1 && rem_y == -1)){
						logs.add(new Log(p_y,p_x,h,w));
					}
					if(!map[h][w]){
						if(rem_x == -1 && rem_y == -1){
							rem_x = w;
							rem_y = h;
							p_x = rem_x;
							p_y = rem_y;
						}else{
							map[rem_y][rem_x] = false;
							map[h][w] = false;
							rem -= 2;
							rem_x = -1;
							rem_y = -1;
						}
					}
					p_x = w;
					p_y = h;
				}

			}
		}

		System.out.println(logs.size());
		for(int n=0;n<logs.size();n++){
			System.out.println(logs.get(n).y+" "+logs.get(n).x+" "+logs.get(n)._y+" "+logs.get(n)._x);
		}


	}

	private static class Log{
		int y,x,_y,_x;
		Log(int y,int x,int _y,int _x){
			this.y = y+1;
			this.x = x+1;
			this._y = _y+1;
			this._x = _x+1;
		}
	}
}