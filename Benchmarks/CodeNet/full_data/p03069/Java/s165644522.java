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
	        
	        int fcnt=0;
	        for(int i=0;i<N;i++) {
	        	if(c[i]=='#') break;
	        	fcnt++;
	        	
	        }
	        
	        int max=0;
	        int ans=0;
	        int bcnt=0;
	        int wcnt=0;
	        for(int i=fcnt;i<N;i++) {
	        	if(c[i]=='#') {
		        		bcnt++;	        		
	        	} else {
		        		wcnt++;
	        	}
	        	max=Math.max(max, wcnt-bcnt);
	        }
	        
	 		ans=Math.min(bcnt,wcnt)-max;
	        System.out.println(ans);
	 }
	 

}
