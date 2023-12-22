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
		outside:for(int h=0;h<H;h++){
			for(int w=0;w<W;w++){
				if(rem <= 1){
					break outside;
				}
				if(!map[h][w]){
					if(rem_x == -1 && rem_y == -1){
						rem_x = w;
						rem_y = h;
					}else{
						map[h][w] = true;
						map[rem_y][rem_x] = true;
						
						while(h != rem_y){
							int f = h;
							if(h > rem_y) h--;
							else h++;

							logs.add(new Log(f,w,h,w));
						}
						while(w != rem_x){
							int f = w;
							if(w > rem_x) w--;
							else w++;

							logs.add(new Log(h,f,h,w));
						}

						rem_x = -1;
						rem_y = -1;

					}

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