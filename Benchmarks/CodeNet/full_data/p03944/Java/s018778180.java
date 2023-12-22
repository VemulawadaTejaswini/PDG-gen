import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(), H = sc.nextInt(), N = sc.nextInt();

		int xmax = W, ymax = H; //xy平面最大の座標
		int xmin = 0, ymin = 0; //xy平面最小の座標
		
		for(int i=0; i<N; i++){
			int x = sc.nextInt(); 
			int y = sc.nextInt();
			int a = sc.nextInt();
			if(a==1){//xの最小値が変わる
				xmin = x;
			}
			else if(a==2){//xの最大値が変わる
				xmax = x;
			}
			else if(a==3){//yの最小値が変わる
				ymin = y;
			}
			else if(a==4){//yの最大値が変わる
				ymax = y;
			}
		}
		int ans = Math.max(0,xmax-xmin) * Math.max(0,ymax-ymin);//０になる場合も考慮
		System.out.println(ans);
	}
}