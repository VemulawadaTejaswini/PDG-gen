import java.util.Scanner;


public class Main{
	static int dfs(int a) {
		if(a%2==1 || a==0) {
			return 0;
		}
		return dfs(a/2)+1;
	}
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int m=1000000000;
    		int N=sc.nextInt();
    		for(int i=0; i<N; i++) {
    			int A=sc.nextInt();
    			m=Math.min(m, dfs(A));
    		}
    		System.out.println(m);
    	}
    }
}