import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<E>[] lists = new List[n];
		
		for(int i = 0; i < n ; i++){
			lists[i] = new LinkedList<E>();
		}
		
		for(int i = 0; i < m ;i ++){
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int s = sc.nextInt();
			
			E e = new E();
			e.u = u;
			e.v = v;
			e.s = s;
			
			lists[u].add(e);
			lists[v].add(e);
		}
		
		
		long[] x = new long[n];
		
		boolean flag = true;
		
		Queue<I2> q = new LinkedList<I2>();
		I2 init = new I2();
		init._1 = 0;
		init._2 = -1;
		q.add(init);

		for(;!q.isEmpty();){
			I2 now = q.poll();
			
			if(x[now._1] != 0 && x[now._1] != now._2){
				flag = false;
				break;
			}
			if(x[now._1] != 0){
				continue;
			}
			
			x[now._1] = now._2;
			
			for(E next: lists[now._1]){
				int p = next.u;
				if(next.u == now._1){
					p = next.v;
				}
				
				if(now._2 == x[p]){
					flag = false;
					break;
				}else{
					I2 i2 = new I2();
					i2._1 = p;
					i2._2 = -now._2;
					q.add(i2);
				}
			}
			if(!flag){
				break;
			}
		}
		
		if(flag){
			
			long[] y = new long[n];
			boolean[] visited = new boolean[n];
			
			LinkedList<Integer> d = new LinkedList<Integer>();
			d.add(0);
			y[0] = 0;
			visited[0] = true;
			
			boolean flag2 = true;
			
			for(;!d.isEmpty();){
				int now = d.poll();
					
				visited[now] = true;
				for(E next: lists[now]){
					int p = next.u ^ next.v ^ now;	
					long pp = next.s - y[now];
					
					if(visited[p]){
						if(y[p] != pp){
							flag2 = false;
							break;
						}
					}else{
						visited[p] = true;
						y[p] = pp;
						d.add(p);
					}
				}
				if(!flag2){
					break;
				}
			}
			
			if(!flag2){
				System.out.println(0);
				return;
			}
			
			long min1 = Long.MAX_VALUE;
			long min2 = Long.MAX_VALUE;
			
			for(int i = 0 ;i < n ; i++){
				if(x[i] == 1){
					min1 = Math.min(y[i], min1); 
				}else{
					min2 = Math.min(y[i], min2);
				}
			}
//			System.out.println(Arrays.toString(x));
//			System.out.println(Arrays.toString(y));
			System.out.println(Math.max(0, min1+min2-1));
			
		}else{
			
			
			for(int xx = 1; xx < 1000000000;xx++){
				int[] y = new int[n];
				boolean[] visited = new boolean[n];
				
				LinkedList<Integer> d = new LinkedList<Integer>();
				d.add(0);
				y[0] = xx;
				visited[0] = true;
				
				boolean flag2 = true;
				
				for(;!d.isEmpty();){
					int now = d.poll();
						
					visited[now] = true;
					for(E next: lists[now]){
						int p = next.u ^ next.v ^ now;	
						int pp = next.s - y[now];
						
						if(visited[p]){
							if(y[p] != pp){
								flag2 = false;
								break;
							}
						}else{
							if(pp < 1){
								flag2 = false;
								break;
							}
							visited[p] = true;
							y[p] = pp;
							d.add(p);
						}
					}
					if(!flag2){
						break;
					}
				}
				if(flag2){
					System.out.println(1);
					return;
				}
			}
			System.out.println(0);
		}
		
	}
	
	class E{
		int u;
		int v;
		int s;
	}
	class I2{
		int _1;
		long _2;
	}
}
