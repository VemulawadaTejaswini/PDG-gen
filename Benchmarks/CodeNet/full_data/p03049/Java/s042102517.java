import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ab = 0;
        int a = 0;
        int b = 0;
        int ba = 0;
        for (int i = 0; i < n; i++) {
            char[] s = sc.next().toCharArray();
            if(s[0] == 'B') b++;
            if(s[s.length-1] == 'A') a++;
            if(s[0] == 'B' && s[s.length-1] == 'A') ba++;
            for (int j = 0; j < s.length - 1; j++) {
                if(s[j] == 'A' && s[j+1] == 'B') ab++;
            }
        }
        int c = a == ba && b == ba ? ba - 1 : Math.min(a, b);
        System.out.println(ab + c);
        sc.close();
    }

}
