import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        if(b % n == 0) ans = n + b;
        else ans = b - n;
        System.out.println(ans);
    }
}
 