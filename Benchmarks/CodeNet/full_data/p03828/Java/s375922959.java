import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    int N = sc.nextInt();
	    
	    if (N == 1) {
	    	System.out.println(1);
	    	return;
	    }
	    
	    int[] map = new int[1001];
	    map[1] = 1;
	    for (int i = 2; i <= N; i++) {
	    	int tmp = 2;
	    	int iCopy = i;
	    	while(iCopy != 1) {
	    		if (iCopy % tmp == 0) {
	    			map[tmp]++;
	    			iCopy /= tmp;
	    		} else {
	    			tmp++;
	    		}
	    	}
	    }
	    
	    long ans = 1;
	    for (int i = 2; i < map.length; i++) {
	    	ans *= (map[i] + 1);
	    	ans %= 1_000_000_007;
	    }
	    
	    System.out.println(ans);
	}    
}	