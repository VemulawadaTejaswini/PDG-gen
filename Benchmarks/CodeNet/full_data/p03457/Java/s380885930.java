import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int prevX = 0;
		int prevY = 0;
		int prevT = 0;
		for(int i=0; i<N; i++){
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int dx = Math.abs(x-prevX);
			int dy = Math.abs(y-prevY);
			int dt = t-prevT;
			if(dx+dy>dt || (dx+dy-dt)%2==1){
				System.out.println("No");
				return;
			}else{
				prevX = x;
				prevY = y;
				prevT = t;
			}
		}
		System.out.println("Yes");
		return;
	}
}