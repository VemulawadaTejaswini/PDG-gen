import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int K = sc.nextInt();
	        
	        int[] cnth=new int[H];
	        int cntf=0;
	        char[][] s = new char[H][W];
	        for(int i=0;i<H;i++) {
        		String c=sc.next();
	        	for(int j=0;j<W;j++) {
	        		s[i][j]=c.charAt(j);
	        		if(s[i][j]=='#')cnth[i]++;
	        	}
	        	if(cntf==0&&cnth[i]!=0) {
	        		cntf=i+1;
	        	}
	        }
	        
	        int ans=0;
			int flg=0;
	        int[][] m=new int[H][W];
	        for(int i=cntf-1;i<H;i++) {
	        	for(int j=0;j<W;j++) {
	        		if(cnth[i]==0) {
	        			m[i][j]=m[i-1][j];
	        		} else {
	        			if(j==0) {
		        			ans++;	        					
	        				flg=0;
	        			}
	        			if(s[i][j]=='#') {
	        				if(flg==0) {
	        					flg++;
	        				} else {
	        					ans++;
	        				}
	        			}
	        			m[i][j]=ans;
	        			
	        		}
	        	}
	        }
	        
	        for(int i=cntf-2;i>=0;i--) {
	        	for(int j=0;j<W;j++) {
	        		m[i][j]=m[i+1][j];
	        	}
	        }
	        StringBuffer sf=new StringBuffer();
	        for(int i=0;i<H;i++) {
	        	for(int j=0;j<W;j++) {
	        		sf.append(m[i][j]);
	        		if(j==W-1) {
		        		sf.append("\n");
	        		} else {
		        		sf.append(" ");
	        		}
	        	}
	        }
	        System.out.println(sf);
	 }
	 

}