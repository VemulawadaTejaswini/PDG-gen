import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	int[] D = new int[10];
    	for(int i=0;i<K;i++) {
    		D[sc.nextInt()]++;
    	}
    	int ans=0;
    	for(int i=1000;i<=10000;i++) {
    		boolean flg=true;
    		if(i<N)continue;
    		boolean st=false;
    		int tmp=i;
    		while(tmp!=0) {
    			int mod=tmp%10;
    			if(D[mod]!=0)flg=false;
    			tmp=tmp/10;
    		}
    		if (flg==true) {
    			ans=i;
    			break;
    		}
    	}
    	
        System.out.println(ans);
        
        		
    }
}