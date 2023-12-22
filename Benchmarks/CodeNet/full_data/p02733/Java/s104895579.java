import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int K = sc.nextInt();
	        char[] c=new char[W];
	        int[][] m=new int[H][W];
	        for(int i=0;i<H;i++) {
	        	String S=sc.next();
	        	c=S.toCharArray();
	        	for(int j=0;j<W;j++) {
	        		m[i][j]=(int)c[j]-'0';
	        	}
	        }
	        
	        int cnt=0;
	        int ans=H*W+1;
	        for(int i=0;i<1<<(H-1);i++) {
		        int[][] g=new int[W+5][H+5];
	        	for(int j=0;j<W;j++) {
			        cnt=0;
	        		for(int k=0;k<H;k++) {
	        			g[j][cnt]=g[j][cnt]+m[k][j];
	        			if((i>>k&1)==1)cnt++;
	        		}
	        	}
	        	int[] now = new int[W];
	        	for(int j=0;j<W;j++) {
	        		boolean isOK=true;
	        		for(int k=0;k<H;k++) {
	        			now[k]=now[k]+g[j][k];
	        			if(now[k]>K)isOK=false;
	        		}
	        		if(isOK==false) {
	        			cnt++;
	        			if(cnt>ans)continue;
	        			j--;
	        			now = new int[W];
	        		}
	        	}
	        	ans=Math.min(ans, cnt);
	        }
	        
	        System.out.println(ans);
	        	        	        
	 }
}