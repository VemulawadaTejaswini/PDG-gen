	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] m = new long[12];
	        m[0]=1;
	        int k=1;
	        for(int i=6;i<100005;i=i*6) {
	        	m[k]=i;
	        	k++;
	        }
	        for(int i=9;i<100005;i=i*9) {
	        	m[k]=i;
	        	k++;
	        }
	        Arrays.sort(m);
	        int[] ans = new int[100005];
	        ans[0]=0;
	        for(int i=1;i<100002;i++) {
	        	long min=100005;
	        	for(int j=0;j<12&&m[j]<=i;j++) {
	        		min = Math.min(min, ans[(int) (i-m[j])]+1);
	        	}
	        	ans[i]=(int) min;
	        }
	        
	        
	        System.out.println(ans[N]);
	        
	    }
	}