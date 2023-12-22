import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		int per = (H*W)%D;

		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i =0;i<H*W;i++){
			data.add(sc.nextInt());
		}

		ArrayList<ArrayList<Integer>> costarray = new ArrayList<ArrayList<Integer>>();
		for(int d=1;d<=D;d++){
			ArrayList<Integer> cost = new ArrayList<Integer>();
			cost.add(0);
			int mp = 0;
			int hoge=-1;
			int x=0;
			int y=0;
			int i=0;
			int j=0;
			if(d <= per){
				hoge =0;
			}
			for(int a =0;a<(H*W)/D+hoge;a++){
				int num = d+a*D;
				if(a==0){
					x = data.indexOf(num)/W+1;
					y = data.indexOf(num)%W+1;
				}
				i = data.indexOf(num+D)/W+1;
				j = data.indexOf(num+D)%W+1;
				mp = mp + Math.abs(x-i) + Math.abs(y-j);
				cost.add(mp);
				x = i;
				y = j;
			}
			costarray.add(cost);
		}

		int Q = sc.nextInt();
		for(int i=0;i<Q;i++){
			int L=sc.nextInt();
			int R=sc.nextInt();
			int ans = costarray.get((L-1)%D).get((R-1)/D)-costarray.get((L-1)%D).get((L-1)/D);
			System.out.println(ans);
		}
		sc.close();
	}
}
