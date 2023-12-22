
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//連結リスト
		List<ArrayList<Integer>> to = new ArrayList();
		for(int i=0;i<N;i++) to.add(new ArrayList<Integer>());
		
		for(int i=0;i<N-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			to.get(a).add(b);
			to.get(b).add(a);
		}
		sc.close();
		
		int v[] = new int[N]; //訪問済管理
		
		int c[] = new int[N-1]; //辺の色配列
 	
		Queue<Integer> q = new ArrayDeque<Integer>(); 
		q.offer(0);//頂点０を入れる
		v[0]=1;//訪問済にする
		
		int point = 0;//辺の色配列の位置を示す。
		
		//使っちゃいけない数字の配列
		List<Integer> ng = new ArrayList<Integer>();
 		
		while(!q.isEmpty()) {
			ng.clear();
			int node = q.poll();
			
			List<Integer> con = to.get(node); //自分と繋がっているノード番号のリスト 
			
			for(int tmp : con) {
				if(v[tmp]==1)continue; //訪問済みなら何もしない
				//入れられる最小値を入れる
				for(int i=1;i<N;i++) {
					if(!ng.contains(i)) {
						c[point]=i;
						point++;
						ng.add(i);
						break;
					}
				}		
				q.offer(tmp); 
				v[tmp]=1;//訪問済にする
			}
		}
		System.out.println();
		
	}
	
}
