import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        int t = -1, b = 0, c = 0;
        long m = 0L;
        char cur = s[0];
        int tmp = 1;
        for (int i = 1; i < s.length; i++) {
            if(s[i] == cur){
                tmp++;
            }else{
                if(t < 0){
                    t = tmp;
                }else if(i < s.length-1){
                    m += tmp/2;
                }
                tmp = 1;
                cur = s[i];
            }
        }
        b = tmp;
        if(t < 0)t=0;
        if(s[0] == s[s.length-1]) c = t + b;
        long ans = m * k + (t/2) + (b/2) + (c/2)*(k-1);
        System.out.println(ans);
        sc.close();

    }

}
