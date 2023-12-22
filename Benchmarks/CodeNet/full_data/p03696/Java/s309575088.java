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
	        
	        int lcnt=0;
	        int rcnt=0;
	        
	        int cnt=0;
	        int j=0;
	        while(cnt<N-1) {
	        	while(cnt<N&&c[cnt]=='(') {
	        		lcnt++;
	        		cnt++;
	        	}
	        	while(cnt<N&&c[rcnt]==')') {
	        		rcnt++;
	        		cnt++;
	        	}
		        if(lcnt>rcnt) {
		        	for(int i=j;i<cnt;i++) {
		        		System.out.print(c[i]);
		        	}
		        	for(int i=0;i<lcnt-rcnt;i++) {
		        		System.out.print(")");
		        	}
		        } else {
		        	for(int i=0;i<rcnt-lcnt;i++) {
		        		System.out.print("(");
		        	}
		        	for(int i=j;i<cnt;i++) {
		        		System.out.print(c[i]);
		        	}
		        }
		        rcnt=0;
		        lcnt=0;
		        j=cnt;
	        }
    		System.out.println("");
        
	         
	 }
	 

}
