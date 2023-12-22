import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean mass[][] = new boolean[H][W];
		int map[][] = new int[H][W];

		int white = 0;
		for(int h=0;h<H;h++){
			String st = sc.next();
			for(int w=0;w<W;w++){
				char ch = st.charAt(w);
				if(ch == '#'){ mass[h][w] = false; }
				else {mass[h][w] = true; white++;}
				map[h][w] = 99999;

			}
		}
		for(int h=0;h<H;h++){
			for(int w=0;w<W;w++){
				if(h==H-1 && w==W-1) break;
				if(!mass[h][w]) continue;

				if(h==0 && w==0){ map[h][w] = 0;}

				if(h!=H-1){
					if(map[h+1][w] > map[h][w]+1){
						map[h+1][w] = map[h][w]+1;
					}
				}	
				if(h!=0){
					if(map[h-1][w] > map[h][w]+1){
						map[h-1][w] = map[h][w]+1;
					}
				}
				if(w!=W-1){
					if(map[h][w+1] > map[h][w]+1){
						map[h][w+1] = map[h][w]+1;
					}
				}
				if(w!=0){
					if(map[h][w-1] > map[h][w]+1){
						map[h][w-1] = map[h][w]+1;
					}
				}
			}
		}

		System.out.println(white - map[H-1][W-1] -1);
	}
}