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
    	for(int i=0;N>0;i++) {
    		int tmp =N%10;
    		boolean flg=false;
    		for(int j=0;j<10;j++) {
    			if(j>=tmp&&D[j]==0) {
    				flg=true;
    				ans=(int) (ans+Math.pow(10,i)*j);
    				break;
    			}
    		}
    		if(flg==false)N=(int) (N+Math.pow(10,i+1));
    		N=N/10;
    	}
    	
        System.out.println(ans);
        
        		
    }
}
