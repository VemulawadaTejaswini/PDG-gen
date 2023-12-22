import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];
        int ans = 0;

        for(int i=0; i<N; i++){
            P[i] = sc.nextInt();
            for(int j =0; j<=i; j++){
                if(P[j]<P[i]){
                    break;
                }
                else if(j==i){
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}