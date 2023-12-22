import java.util.Scanner;

public class Main {

    private static int N;
    private static int[] P;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        
        P = new int[N];
        for(int i=0;i<N;i++) {
            P[i] = sc.nextInt();
        }
        
        int ans = 0;
        int tempMin = Integer.MAX_VALUE;
        for(int i=0;i<N; i++) {
            if(P[i] <= tempMin) {
                ans++;
            }
            tempMin = Math.min(P[i], tempMin);
        }
        
        System.out.println(ans);
    }

}
