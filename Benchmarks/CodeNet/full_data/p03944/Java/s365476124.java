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
			
			if(a==1){//xminが変わる可能性
				xmin = Math.max(xmin, x);
			}
			else if(a==2){//xmaxが変わる可能性
				xmax = Math.min(x, xmax);
			}
			else if(a==3){//yminが変わる可能性
				ymin = Math.max(ymin, y);
			}
			else if(a==4){//ymaxが変わる可能性
				ymax = Math.min(y, ymax);
			}
		}

		if((xmin==0&&xmax==0) && (ymin==0&&ymax==0)){
			System.out.println("0");
		}
		else{
			System.out.println((xmax-xmin)*(ymax-ymin));
		}
	}
}