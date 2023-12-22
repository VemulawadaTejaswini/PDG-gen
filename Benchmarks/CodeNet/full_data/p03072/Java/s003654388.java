import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];
        H[0] = sc.nextInt();
        int max = H[0];
        int ans = 1;

        for(int i=1; i<N; i++){
            H[i] = sc.nextInt();
            max = Math.max(max, H[i]);
            if(H[i]==max){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}