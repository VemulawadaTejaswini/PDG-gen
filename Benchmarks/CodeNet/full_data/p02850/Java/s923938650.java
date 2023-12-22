import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			int[]a = new int[N-1];
			int[]b = new int[N-1];

			int []c = new int[N+1];
			int[]hen = new int[N-1];
			GM[]map = new GM[N];


			for(int i = 0;i<N;i++) {
				map[i] = new GM(i+1);
			}

			for(int i = 0;i<N-1;i++) {
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
				c[a[i]]++;
				c[b[i]]++;
				map[a[i]-1].hen.put(b[i], 0);
				map[b[i]-1].hen.put(a[i], 0);
			}

			int max = 0;
			for(int i = 1;i<=N;i++) max = Math.max(max, c[i]);


			Deque<GM>queue = new ArrayDeque<GM>();
			queue.addFirst(map[0]);
			map[0].ch = true;


			int i = 1;
			while(!queue.isEmpty()) {
				GM p  =queue.removeLast();
				for(Integer key:p.hen.keySet()) {
					if(map[key-1].ch==false) {
						map[key-1].ch=true;
						queue.addFirst(map[key-1]);
						if(map[key-1].pre==i) {
							i++;
							if(i>max)i = 1;
							p.hen.put(key, i);
							map[key-1].hen.put(p.num, i);
							map[key-1].pre=i;
						}else {
							p.hen.put(key, i);
							map[key-1].hen.put(p.num, i);
							map[key-1].pre=i;
							i++;
							if(i>max)i=1;
						}

					}
				}
			}

			System.out.println(max);


			for(int k = 0;k<N-1;k++) {

				int p = map[a[k]-1].hen.get(b[k]);
				System.out.println(p);

			}






		}


	}

	private static  class GM{
		int num = 0;
		boolean ch = false;
		int pre = 0;
		Map<Integer,Integer>hen = new TreeMap<Integer,Integer>();


		GM(int n){
			num = n;
		}
	}



}
