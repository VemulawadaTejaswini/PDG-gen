	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
	        for(long i=0;i<N-1;i++) {
	        	int ai = sc.nextInt()-1;
	        	int bi = sc.nextInt()-1;
	        	list.get(ai).add(bi);
	        	list.get(bi).add(ai);
	        }
	        long[] a = new long[N];
	        long sum =0;
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	            sum=sum+a[i];
	        }
	        Arrays.sort(a);
	        StringBuffer ans = new StringBuffer();
			LinkedList<Integer> q= new LinkedList<Integer>();
			q.add(0);
			q.add(-1);
			int cnt=N-1;
			long[] m = new long[N];
			while(!q.isEmpty()) {
				int now = q.poll();
				int pre = q.poll();
				m[now]=a[cnt];
				cnt--;
				for(int k:list.get(now)) {
					if(k==pre)continue;
					q.add(k);
					q.add(now);
					
				}
			}
			for(int i=0;i<N;i++) {
				ans.append(m[i]);
				if(i!=N-1)ans.append(" ");
			}
			System.out.println(sum-a[N-1]);
	        System.out.println(ans);
	    }
	}