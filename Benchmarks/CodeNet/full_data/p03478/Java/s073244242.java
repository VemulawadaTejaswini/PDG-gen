import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.next());
    	int A = Integer.parseInt(sc.next());
    	int B = Integer.parseInt(sc.next());

    	int ans = 0;

    	for (int i=0; i<=N; i++){
    		if (judge(i, A, B)){
    			ans += i;
    		}
    	}

    	System.out.println(ans);

    }
	  static boolean judge(int n, int a, int b){
		int x = 0;
		while(n>0){
			x += n % 10;
			n = n /10;
		}
		if (x >= a && x<= b){
			return true;
		}else{
			return false;
		}
	}
}