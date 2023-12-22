import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        
	        int max=0;
	        int ans=3000000;
	        int bcnt=0;
	        int wcnt=0;
	        for(int i=0;i<N;i++) {
	        	if(c[i]=='#') {
		        		bcnt++;	        		
	        	} else {
		        		wcnt++;
	        	}
	        }
	        int ibcnt=0;
	        int iwcnt=0;
	        for(int i=0;i<N;i++) {
	        	ans=Math.min(ans, ibcnt+wcnt-iwcnt);
	        	if(c[i]=='#') {
	        		ibcnt++;
	        	} else {
	        		iwcnt++;
	        	}
	        }
        	ans=Math.min(ans, ibcnt+wcnt-iwcnt);
	        System.out.println(ans);
	 }
	 

}
