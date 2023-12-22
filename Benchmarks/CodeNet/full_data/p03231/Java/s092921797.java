
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = n * m;
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();
        while (n != m){
            if(n > m)n -= m;
            else m -= n;
        }
        k /= n;
        int ss = (int)(k / s.length);
        int tt = (int)(k / t.length);
        char o[] = new char[(int)k];
        for (int i = 0;i < s.length;++i){
            o[i * ss] = s[i];
        }
        for (int i = 0;i < t.length;++i){
            if(o[i * tt] != 0 && o[i * tt] != t[i]){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(k);

    }

}



