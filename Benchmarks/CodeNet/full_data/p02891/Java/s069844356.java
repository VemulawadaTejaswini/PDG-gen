import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        long ans = 0L;
        String f = null, m = null, b = null;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(0) != s.charAt(i)){
                f = s.substring(0, i);
                s = s.substring(i);
                break;
            }else if (i == s.length()-1){
                f = s;
                s = "";
            }
        }
        if(s.length() == 0){
            long sum = f.length() * k;
            ans = sum / 2;
        }else{
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(s.length()-1) != s.charAt(s.length()-1-i)){
                    b = s.substring(s.length()-i);
                    m = s.substring(0, s.length()-i);
                    break;
                }else if(i == s.length()-1){
                    b = s;
                }
            }
            if(m == null){
                ans = ((f.length()/2) + (b.length()/2)) * k;
            }else{
                long mc = 0L, tmp = 1;
                for (int i = 1; i < m.length(); i++) {
                    if(m.charAt(i-1) == m.charAt(i)){
                        tmp++;
                    }else{
                        mc += tmp/2;
                        tmp = 1;
                    }
                }
                mc += tmp/2;
                if(f.charAt(0) == b.charAt(0)){
                    ans = mc * k;
                    ans += f.length()/2 + b.length()/2;
                    ans += ( (f.length() + b.length()) / 2 ) * (k-1);
                }else{
                    ans = ( (f.length()/2) + (b.length()/2) + mc ) * k;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
