import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[] ss = new int[26];
        int[] tt = new int[26];

        Arrays.fill(ss, 0);
        Arrays.fill(tt, 0);
        for(int i = 0; i < s.length(); i++){
            ss[s.charAt(i) - 'a'] ++;
            tt[t.charAt(i) - 'a'] ++;
        }
        Arrays.sort(ss);
        Arrays.sort(tt);

        String ans = "Yes";
        for(int i = 0; i < 26; i++){
            if(ss[i] != tt[i]) ans = "No";
        }
        
        System.out.println(ans);
    }
}