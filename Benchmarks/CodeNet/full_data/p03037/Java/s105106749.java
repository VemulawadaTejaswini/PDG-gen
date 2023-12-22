import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] gatestart = new int[M];
        int[] gateend = new int[M];
        
        for (int i = 0; i < M; i++) {
        	gatestart[i] = sc.nextInt();
        	gateend[i] = sc.nextInt();
        }
        
        int d = 0;
        int e = Integer.MAX_VALUE; 
    	for (int i = 0; i < M; i++) {
//    		System.out.println(gatestart[i]);
//    		System.out.println(gateend[i]);
    		
    		if (gatestart[i] <= gateend[i]) {
	    		if (N >= gatestart[i]) {
	    			d = Math.max(d, gatestart[i]);
	    		}
	    		
	    		if (N >= gateend[i]) {
	    			e = Math.min(e, gateend[i]);
	    		}
    		}
    		
    		
    	}
    	int ans = Math.abs(d - e);
//        int ans = d - e;
//        if (!(ans > 0)) {
//        	ans = 0;
//        } else {
//        	ans++;
//        }
        
        System.out.println(ans);
    }

}