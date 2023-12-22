import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int cost = 0;
        int max = 0;
        for(int i = 0; i<N; i++) {
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        }
        for (int i = 0; i<N; i++) {
        	for (int j = 0; j<N; j++ ) {
        		if(i==j) {continue;}
        		// p,qを設定
        		int p = x[i] - x[j];
        		int q = y[i] - y[j];
        		cost=0;
//        		System.out.println("p=" + p + ",q=" + q );
        		for (int k = 0; k<N; k++) {
        			for(int l = 0; l<N; l++) {
        				if (p==x[k] - x[l] && q==y[k] - y[l]) {
        					cost++;
        				}
        			}
        		}
        		if(max<cost) {
        			max=cost;
        		}
        	}
        }
        int ans=1;
        if(N>1) {          	
         ans = N-max;	
        }
        System.out.println(ans);
    }
}
