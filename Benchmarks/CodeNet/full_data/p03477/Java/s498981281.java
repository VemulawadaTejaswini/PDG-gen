import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + sc.nextInt();
        int m = sc.nextInt() + sc.nextInt();
        String ans;
        if(n > m) ans = "Left";
        else if(n == m) ans = "Balanced";
        else ans = "Right";
        System.out.println(ans);
    }
}