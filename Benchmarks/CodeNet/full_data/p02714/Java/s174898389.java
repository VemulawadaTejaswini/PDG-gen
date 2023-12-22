import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String N = sc.next();
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        int[] m = new int[c.length];
	        for(int i=0;i<c.length;i++) {
	        	if(c[i]=='R') {
	        		m[i]=0;
	        	} else if(c[i]=='B') {
	        		m[i]=1;
	        	} else {
	        		m[i]=2;
	        	}
	        }
	        
	        long ans=0;
	        for(int i=0;i<c.length-2;i++) {
	        	int[] kk=new int[3];
	        	kk[m[i]]++;
	        	for(int j=i;j<c.length-1;j++) {
	        		if(kk[m[j]]==1)continue;
	        		kk[m[j]]++;
	        		for(int k=j;k<c.length;k++) {
	        			if(kk[m[k]]==1)continue;
	        			if(j-i!=k-j)ans++;
	        		}
	        		kk[m[j]]--;
	        	}
	        }
	        
	        
	    	System.out.println(ans);
	        
	        	        	        
	 }
}