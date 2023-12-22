import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c0 = s.charAt(0), c1 = s.charAt(1),
             c2 = s.charAt(2), c3 = s.charAt(3);
        String ans = "No";
        if((c0 == c1 || c2 == c3) && (c1 == c2)) ans = "Yes";
        System.out.print(ans);
    }
}