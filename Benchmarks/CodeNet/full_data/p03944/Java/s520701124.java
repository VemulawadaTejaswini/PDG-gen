import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(), H = sc.nextInt(), N = sc.nextInt();

		int sq = 0;
		int xmax = W, ymax = H; //xy平面最大の座標
		int xmin = 0, ymin = 0; //xy平面最小の座標
		
		for(int i=0; i<N; i++){
			int x = sc.nextInt(); 
			int y = sc.nextInt();
			int a = sc.nextInt();
			if(a==1){//xの最小値が変わる
				xmin = Math.max(xmin,x);
			}
			else if(a==2){//xの最大値が変わる
				xmax = Math.min(xmax,x);
			}
			else if(a==3){//yの最小値が変わる
				ymin = Math.max(ymin,y);
			}
			else if(a==4){//yの最大値が変わる
				ymax = Math.min(ymax,y);
			}
		}
		int ans = (xmax-xmin) * (ymax-ymin);//必要なのは最大、最小の座標
		System.out.println(ans);
	}
}