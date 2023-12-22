import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        String ans;
        if(r < 1200) ans = "ABC";
        else if(r < 2800) ans = "ARC";
        else ans = "AGC";
        System.out.println(ans);
    }
}