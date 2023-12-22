import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];

        int ab = 0;
        int a = 0;
        int b = 0;

        for(int i = 0; i < n; i++){
            s[i] = sc.next();
            a = s[i].charAt(s[i].length() - 1) == 'A' ? a + 1 : a;
            b = s[i].charAt(0) == 'B' ? b + 1 : b;
            for(int j = 0; j < s[i].length(); j++){
                int index = s[i].indexOf("AB", j);
                if(index != -1){
                    j = index;
                    ab++;
                }else{
                    j = s[i].length();
                }
            }
        }

        int ans = Math.min(a, b);
        ans = ans == s.length ? ans - 1 + ab : ans + ab;
        System.out.println(ans);

    }

}
