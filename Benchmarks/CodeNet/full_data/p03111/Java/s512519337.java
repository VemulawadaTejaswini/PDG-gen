	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        int[] l = new int[N];
	        for(int i=0;i<N;i++) {
	        	l[i] = sc.nextInt();
	        }
	        
	        long ans=Long.MAX_VALUE;
	        for(int i=0;i<Math.pow(4, N);i++) {
		        int[] cnt= new int[4];
		        int[] length= new int[4];
	        	int now = i;
	        	for(int j=0;j<N;j++) {
	        		int t = now%4;
	        		cnt[t]++;
	        		length[t]=length[t]+l[j];
	        		now=now>>2;
	        	}
	        	if(cnt[0]==0)continue;
	        	if(cnt[1]==0)continue;
	        	if(cnt[2]==0)continue;
	        	long tmp = cnt[0]+cnt[1]+cnt[2]-3;
	        	tmp=tmp*10;
	        	tmp=tmp+Math.abs(length[0]-A);
	        	tmp=tmp+Math.abs(length[1]-B);
	        	tmp=tmp+Math.abs(length[2]-C);
	        	ans=Math.min(ans, tmp);
	        	
	        }
	        System.out.println(ans);
		 }
		 
	}