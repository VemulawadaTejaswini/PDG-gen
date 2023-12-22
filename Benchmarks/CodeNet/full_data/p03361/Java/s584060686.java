import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		boolean map[][] = new boolean[H][W];

		for(int h=0;h<H;h++){
			String st = sc.next();
			for(int w=0;w<W;w++){
				if(st.charAt(w) == '#')
				map[h][w] = true;
				else
				map[h][w] = false;
 			}
		}
		boolean flag = true;

		outside:for(int h=0;h<H;h++){
			for(int w=0;w<W;w++){

				if(map[h][w]){
					if(h>0 && map[h-1][w]) continue;
					if(h<H-1 && map[h+1][w]) continue;
					if(w>0 && map[h][w-1]) continue;
					if(w<W-1 && map[h][w+1]) continue;


					flag = false;
					break outside;
				}
				
 			}
		}

		if(flag) System.out.println("Yes");
		else System.out.println("No");

	}
}