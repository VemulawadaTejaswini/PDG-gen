import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = "keyence";
        int n = s.length();
        int m = x.length();
        String ans = "NO";
        for(int i = 0; i <= 7; i++){
            boolean bl = true;
            for(int j = 0; j < 0; j++){
                if(s.charAt(j) != x.charAt(j)){
                    bl = false;
                }
            }
            for(int j = n + i - 7; j < n; j++){
                if(s.charAt(j) != x.charAt(j + 7 - n)){
                    bl = false;
                }
            }
            if(bl) ans = "Yes";
        }
        if(s.compareTo(x) == 0) ans = "YES";
        System.out.println(ans);
    }
}
