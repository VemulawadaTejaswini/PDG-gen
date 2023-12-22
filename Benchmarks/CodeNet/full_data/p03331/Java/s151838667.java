import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < N; i++){
            ans = Math.min(ans, calc(i) + calc(N - i));
        }
        System.out.println(ans);
    }
    public static int calc(int i)
    {
        if(i == 0){
            return 0;
        }
        return i % 10 + calc((i - i % 10) / 10);
    }
}