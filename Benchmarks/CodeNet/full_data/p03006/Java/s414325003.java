import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] ok = new int [N];
        int cost = 0;
        int max = 9999;
        for(int i = 0; i<N; i++) {
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        }
        	int a = x[0];
        	int b = y[0];
        	ok[0] = 1;
        	// A１～N-1までループ
        	for (int j = 1; j<N; j++ ) {
            	cost = 1;
            	for (int z = 1; z<N; z++) {
                	ok[z] = 0;        		
            	}
        		// p,qを設定
        		int p = x[j] - a;
        		int q = y[j] - b;
//        		System.out.println("p=" + p + ",q=" + q );
        		ok[j] = 1;
        		int wa = x[j];
        		int wb = y[j];
        		for (int k = 1; k<N; k++) {
        			if (wa + p == x[k] && wb + q == y[k] && ok[k] == 0) {
        				wa = wa + p;
        				wb = wb + q;
        				ok[k] = 1;
        			} else if(wa - p == x[k] && wb - q == y[k] && ok[k] == 0) {
        				wa = wa - p;
        				wb = wb - q;
        				ok[k] = 1;        				
        			} else {
        				int flg=0;
        				if (ok[k]==0) {
        					for (int z=0;z<N;z++) {
        						if (ok[z]==0) {
        							wa = x[z];
        							wb = y[z];
        							ok[z] = 1;
        							cost++;
        							flg =1;
        						}
        					}
            				if (flg==0) {
//            					System.out.println(cost);
            					if (max > cost) {
            						max = cost;
            					}
            					break;
            				}
        				}
        			}
        			
        		}
        	}
        int ans=1;
        if(N>1) {          	
         ans = max;	
        }
        System.out.println(ans);
    }
}