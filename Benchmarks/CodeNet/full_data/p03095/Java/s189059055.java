import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] cs = sc.next().toCharArray();
        long[] ls = new long[26];
        long t = 1;
        for(int i = 0 ;i < 26;++i){
            ls[i] = 1;
        }
        for(int i = 0;i < n;++i){
            ++ls[cs[i] - 'a'];
        }
        for(int i = 0 ;i < 26;++i){
            t *= ls[i];
        }
        --t;
        t %= 1000000007;
        System.out.println(t);
    }

}


