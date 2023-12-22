import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        double ans = 0;

        for(int i=1; i<=N; i++){
            int a = i;
            for(int j=0; j<=20; j++){
                if(a<K){
                    a *= 2;
                }
                if(a>=K){
                    ans += 1.0 / N * Math.pow(1.0/2, j);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}