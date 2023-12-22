	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int Q = sc.nextInt();
	        long[] s = new long[A+2];
	        s[0]=-Long.MAX_VALUE/5;
	        for (int i=1 ; i<=A; i++) {
	            s[i] = Long.parseLong(sc.next());
	        }
	        s[A+1]=Long.MAX_VALUE/5;
	        long[] t = new long[B+2];
	        t[0]=-Long.MAX_VALUE/5;
	        for (int i=1 ; i<=B; i++) {
	            t[i] = Long.parseLong(sc.next());
	        }
	        t[B+1]=Long.MAX_VALUE/5;
	        long[] x = new long[Q];
	        for (int i=0 ; i<Q; i++) {
	            x[i] = Long.parseLong(sc.next());
	        }
	        
	        	        
	        for(int i=0;i<Q;i++) {
	        	int left = 0;
	        	int right = A+1;
	        	while(right-left>1) {
	        		int mid = left+(right-left)/2;
	        		if(s[mid]>=x[i]) {
	        			right=mid;
	        		} else {
	        			left=mid;
	        		}
	        	}
	        	long t1 = Math.min(x[i]-s[left], s[right]-x[i]);
	        	
	        	int left2 = 0;
	        	int right2 = B+1;
	        	while(right2-left2>1) {
	        		int mid = left2+(right2-left2)/2;
	        		if(t[mid]>=x[i]) {
	        			right2=mid;
	        		} else {
	        			left2=mid;
	        		}
	        	}
	        	
	        	long sl=s[left];
	        	long sr=s[right];
	        	long tl=t[left2];
	        	long tr=t[right2];
	        	
	        	long ans= x[i]-Math.min(s[left], t[left2]);
	        	ans=Math.min(ans, Math.max(s[right], t[right2])-x[i]);
	        	ans=Math.min(ans, Math.min(sr-x[i], x[i]-tl)+sr-tl);
	        	ans=Math.min(ans, Math.min(tr-x[i], x[i]-sl)+t[right2]-s[left]);
	        	System.out.println(ans);
	        }
	        
		 }
		 
	 
	}