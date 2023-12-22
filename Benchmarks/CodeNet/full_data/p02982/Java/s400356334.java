import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int cnt = 0;
        int[][] x = new int[N][D];
        for(int i = 0; i<N; i++) {
        	for(int j = 0; j<D; j++) {
            	x[i][j] = sc.nextInt();        		
        	}
        }

        double d = 0;
        for(int i=0; i<N; i++) {
        	for(int j = i + 1; j<N; j++) {
        		d = 0;
        		for(int k = 0; k<D; k++) {
            		d= d + Math.pow(x[i][k] - x[j][k], 2); 
        		}
    			d = Math.pow(d, 1.0/2);
    			if(d==Math.floor(d)) {
    				cnt++;
    			}
        	}
        }
        
        
        
        System.out.println(cnt);
    }
}