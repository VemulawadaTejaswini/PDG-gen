import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		List<ArrayList<int[]>> sushi = new ArrayList<ArrayList<int[]>>();
		for(int i=0;i<N;i++)sushi.add(new ArrayList<int[]>());
		for(int i=0;i<N;i++) {
			int t = sc.nextInt() - 1;
			int d[] = {sc.nextInt(), 0};//同要素の中で最大なら1
			sushi.get(t).add(d);
		}
		sc.close();
		
		//to remove an unnecessary factor
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1,p2)->{
			int ret = p1[1]-p2[1];
			if(ret == 0) ret = p1[0]-p2[0];
			return ret;
		});
		
		List<int[]> list = new ArrayList<int[]>();
		
		for(int i=0;i<N;i++) {
			ArrayList<int[]> tmp = sushi.get(i);
			if(tmp.isEmpty())continue;
			tmp.sort((t1,t2)->t2[0]-t1[0]);
			tmp.get(0)[1]=1;//先頭の最大要素にフラグを立てる
			//そしてListにつめる
			for(int t[] :tmp)list.add(t);
		}			

		list.sort((t1,t2)->t2[0]-t1[0]);
		long div = 0;
		long sum = 0;
		for(int i=0;i<K;i++) {
			int tmpMax[] = list.get(i);
			sum += tmpMax[0];
			pq.add(tmpMax);
			if(tmpMax[1]==1)div++;
		}
		for(int i=0;i<K;i++) {
			list.remove(0);			
		}
		
		List<int[]> listMax = new ArrayList<int[]>();
		for(int tmp[]:list) {
			if(tmp[1]==1)listMax.add(tmp);
		}
		
		long ans = sum + div*div;
		for(int i=0;i<listMax.size();i++) {
			int dec[] = pq.poll();
			if(dec[1]==1)break;
			sum -= dec[0];
			int inc[] = listMax.get(i);
			if(inc==null)continue;
			pq.offer(inc);
			sum += inc[0];
			div++;
			ans = Math.max(ans, sum+div*div);
		}
		System.out.println(ans);	
	}
}
