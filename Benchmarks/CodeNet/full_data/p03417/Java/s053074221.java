import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args) {
        //解説動画を見て改めて提出
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
    	
        if (N > 2 && M > 2) {
        	System.out.println((N - 2) * (M - 2));
        } else if (N == 2 || M == 2) {
        	System.out.println(0);
        } else {
        	System.out.println(Math.max(N, M) - 2);
        }
        
        
    }
    
}