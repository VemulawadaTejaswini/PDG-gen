import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int x1 = 0;
		int x2 = w;
		int y1 = 0;
		int y2 = h;
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			if(a==1) {
				x1 = Math.max(x1,x);
			}else if(a==2) {
				x2 = Math.min(x2, x);
			}else if(a==3) {
				y1 = Math.max(y1, y);
			}else {
				y2 = Math.min(y2, y);
			}
		}
		if(x2>x1 && y2>y1) {
			System.out.println((x2-x1)*(y2-y1));
		}else {
			System.out.println(0);
		}
	}

}