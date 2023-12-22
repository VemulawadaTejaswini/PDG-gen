import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        long ans = 0;


        if( K > 2 * N){
            ans = 0;
        }
        else if (K > N){
            if(K % 2 == 0){
                ans = 1;
            }
            else{
                ans = 0;
            }
        }
        else if(K % 2 == 0){
            int KK = 2 * N/K;
            ans += (int) Math.pow((KK/2), 3) + (int) Math.pow( ( ( KK + 1 ) / 2 ), 3);
        }
        else if(K % 2 == 1){
            ans += (int) Math.pow( (N/K) , 3);
        }
        System.out.println(ans);
    }
}