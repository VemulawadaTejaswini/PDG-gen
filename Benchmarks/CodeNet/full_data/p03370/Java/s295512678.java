import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] m = new int[N];
        int M = 0;
        int ans = 0;
        int min = X;

        for(int i=0; i<N; i++){
            m[i] = sc.nextInt();
            min = Math.min(min, m[i]);
            M += m[i];
            ans += 1;
        }
        for(int i=0; i<X; i++){
            if(X-M>=min){
                M += min;
                ans += 1;
            }
            else{
                break;
            }
        }
        System.out.println(ans);
    }
}