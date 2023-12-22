import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int A[] = new int[N+1];
        int ans[] = new int[N+1];

        for(int i=1;i<=N;i++) {
        	A[i] = stdin.nextInt();
        }
        for(int i=1;i<=N;i++) {
        	ans[A[i]] = i;
        }
        for(int i=1;i<=N;i++) {
        	System.out.printf("%d ", ans[i]);
        }
    }
}
