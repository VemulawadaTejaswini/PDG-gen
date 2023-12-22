import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int ans = c;
        if(a == c) ans = b;
        if(b == c) ans = a;
        System.out.print(ans);
    }
}