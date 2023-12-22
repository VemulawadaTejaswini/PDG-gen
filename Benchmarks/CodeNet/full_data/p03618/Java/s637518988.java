import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int[] cnt = new int[26];
        for (int i = 0; i < A.length(); i++) {
            cnt[A.charAt(i)-'a']++;
        }
        long ans = (long)(A.length())*(A.length()-1)/2+1;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] >= 2) ans -= (long)cnt[i]*(cnt[i]-1)/2;
        }
        System.out.println(ans);
    }
}
