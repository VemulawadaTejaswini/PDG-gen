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
	        
	        int wcnt=0;
	        int bflg=0;
	        int wflg=0;
	        int bcnt=0;
	        int ans=0;
	        for(int i=fcnt;i<N;i=i) {
	        	if(c[i]=='#') {
		        	while(i<N&&c[i]=='#') {
		        		bcnt++;
		        		bflg=1;
		        		i++;
		        	}	        		
	        	} else {
		        	while(i<N&&c[i]=='.') {
		        		wcnt++;
		        		wflg=1;
		        		i++;
		        	}
	        	}
	        	if(bflg==1&&wflg==1) {
	        		ans=ans+Math.min(bcnt, wcnt);
	        		wcnt=0;
	        		bcnt=0;
	        		wflg=0;
	        		bflg=0;
	        	}
	        }
	        
	        System.out.println(ans);
	 }
	 

}