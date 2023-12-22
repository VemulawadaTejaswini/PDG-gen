import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
		Map <Integer,Integer> mapL = new HashMap<Integer,Integer> ();

		Scanner sc = new Scanner(System.in);
			// 整数の入力
			int w,h,x,y,lenx,leny,index;
			int len,sumLen,result;
			double sx,sy,sxy;
			w = sc.nextInt();
			h = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			sumLen=0;
			result=0;
			sc.close();

			lenx=x;
			if(lenx>w-x) lenx=w-x;
			sx=lenx*h;
			leny=y;
			if(leny>h-y) leny=h-y;
			sy=leny*w;
			if(sx>sy) {
				sxy=sx;
			}
			else {
				sxy=sy;
			}
			if(x==w-x && y==h-y)result=1;
			else result=0;
			System.out.print(String.valueOf(sxy));
			System.out.print(" ");
			System.out.println(result);
			

			// 出力

	}
}