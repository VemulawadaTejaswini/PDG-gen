import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        long t = -1L, b = 0L, c = 0L;
        long m = 0L;
        char cur = s[0];
        long tmp = 1L;
        for (int i = 1; i < s.length; i++) {
            if(s[i] == cur){
                tmp++;
            }else{
                if(t < 0){
                    t = tmp;
                }else if(i < s.length-1){
                    m += tmp/2;
                }
                tmp = 1L;
                cur = s[i];
            }
        }
        b = tmp;
        if(t < 0)t=0;
        if(s[0] == s[s.length-1]) c = (t + b)/2;
        else c = (t/2) + (b/2);
        long ans = m * k + (t/2) + (b/2) + c*(k-1);
        System.out.println(ans);
        sc.close();

    }

}
