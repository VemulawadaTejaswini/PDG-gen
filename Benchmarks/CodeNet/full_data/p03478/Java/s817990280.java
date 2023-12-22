import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++)
            if(judge(i, a, b)) ans += i;
        System.out.println(ans);
    }
    static boolean judge(int i, int a, int b){
        int k = 0;
        while(i > 0){
            k += i - i / 10 * 10;
            i /= 10;
        }
        if(a <= k && k <= b) return true;
        else return false;
    }
}