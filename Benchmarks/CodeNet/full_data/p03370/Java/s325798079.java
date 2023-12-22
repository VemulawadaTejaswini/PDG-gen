    import java.util.*;
    class Main {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
    	int X = sc.nextInt();
    	int min = Integer.MAX_VALUE;
    	int ans = 0;

        for(int i = 0; i < N; i++) {
    	    int a = sc.nextInt();
    	    X -= a;
    	    min = Math.min(a, min);
    	    i--;
    	    if(min>=X)
    		break;
    	}
    	System.out.println(ans);
        }
    }