import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans;

        if(s.charAt(0) != 'A' || s.charAt(1) <= 'Z' || s.charAt(s.length() - 1) <= 'Z') ans = "WA";

        else{
            int c_count = 0;
            int small_count = 0;
            int other = 0;
            for(int i = 2; i < s.length() - 1; i++){
                if(s.charAt(i) == 'C')     c_count++;
                else if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a') small_count++;
                else other++;
            }

            if(c_count == 1 && small_count == s.length() - 4 && other == 0) ans = "AC";
            else ans = "WA";
        }

        System.out.println(ans);
    }
}