	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextLong();	
	        String S1 = sc.next();
	        char[] c1 = S1.toCharArray();
	        String S2 = sc.next();
	        char[] c2 = S2.toCharArray();
	        long ans=3;
	        boolean flg=false;
	        for(int i=0;i<N;i++) {
	        	if(c1[i]!=c2[i]) {
	        		if(i==0||flg==true) {
		        		ans=(ans*2)%mod;	        			
	        		} else {
		        		ans=(ans*3)%mod;	        				        			
	        		}
	        		i++;
	        		flg=false;
	        	} else {
	        		if(flg==true) {
	        			ans=(ans*2)%mod;
	        		}
	        		flg=true;
	        	}
	        }
	        
	        
	        System.out.println(ans);
	        

	    }
	    
	    

	}
	