import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> blue = new HashMap<>();
        Map<String, Integer> red = new HashMap<>();
        int S = sc.nextInt();
        String[] s = new String[S];
        for(int i = 0; i < S; i++){
            s[i] = sc.next();
            if(blue.containsKey(s[i]))
                blue.put(s[i], blue.get(s[i]) + 1);
            else
                blue.put(s[i], 1);
            red.put(s[i], 0);
        }
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            String t = sc.next();
            if(red.containsKey(t))
                red.put(t, red.get(t) + 1);
            else
                red.put(t, 1);
        }
        int ans = 0;
        for(int i = 0; i < S; i++)
            ans = Math.max(ans, blue.get(s[i]) - red.get(s[i]));
        System.out.println(ans);
    }
}