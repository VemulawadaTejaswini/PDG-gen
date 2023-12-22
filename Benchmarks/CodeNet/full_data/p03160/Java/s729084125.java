    import java.util.*;
    public class Main {
    	public static void main(String[] args) {
    		Scanner s = new Scanner(System.in);
    		int n = s.nextInt();
    		int[] h = new int[n];
    		for (int i = 0; i < n  ; i++ ) {
    			h[i] = s.nextInt();
    		}
    		System.out.println(calc(h, 0));
    	}
    	public static int calc(int[] h, int pos) {
    		if(pos > h.length){
              return 0;
            }
          return Math.min( calc(h, pos+1) + Math.abs(h[pos] - h[pos+1]),
                          calc(h, pos+2) + Math.abs(h[pos] - h[pos+2]));
          
    	}
    }