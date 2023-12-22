	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
//		 static int mod =  (int) (Math.pow(10,9)+7);
		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N= sc.nextInt();
	        int K= sc.nextInt();
	        String S = sc.next()+"0000";
	        char[] c = S.toCharArray();
	        int[] a=new int[N+10];
	        int[] b=new int[N+10];
	        int cnt=0;
	        for(int k=0;cnt<N;k++) {
		        int acnt=0;
		        int bcnt=0;
		        while(c[cnt]=='1') {
		        	acnt++;
		        	cnt++;
		        }		        
		        a[k]=acnt;
	        	while(cnt<N&&c[cnt]=='0') {
	        		bcnt++;
	        		cnt++;
	        	}
	        	b[k]=bcnt;
	        }
	        long ans=0;
	        int[] sum = new int[N+10];
	        sum[0]=a[0];
	        for(int i=0;i<K;i++) {
	        	sum[0]=sum[0]+b[i]+a[i+1];	        	
	        }
	        ans=sum[0];
	        for(int i=1;i<N-K;i++) {
	        	sum[i]=sum[i-1]+a[i+K]+b[i+K-1]-a[i-1]-b[i-1];
	        	ans=Math.max(ans,sum[i]);
	        }
	        
	        System.out.println(ans);
	        

	    }
	    
	    

	}