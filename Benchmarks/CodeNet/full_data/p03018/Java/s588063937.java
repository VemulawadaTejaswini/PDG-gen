	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        String S = "ZZZZ" + sc.next();
	        char[] c = S.toCharArray();
	        long ans=0;
        	int bccnt=0;
        	int N=c.length;
	        for(int i=c.length-1;i>=0;i--) {
	        	if(c[i]=='C') {
	        		if(c[i-1]=='B') {
	        			bccnt++;
	        			i--;
	        			if(c[i-1]=='A') {
	        				ans=ans+bccnt;
	        				i--;
	        				while(c[i-1]=='A') {
	        					i--;
	        					ans++;
	        				}
	        				bccnt=1;
	        			}
	        		} else {
	        			bccnt=0;
	        		}
	        	} else {	        		
	        		bccnt=0;
	        	}
	        	
	        }
	        
	        
	        System.out.println(ans);
	        
	    }
	}
