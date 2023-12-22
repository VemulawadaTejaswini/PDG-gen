import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        int ans = 0;
        int[] acgt = new int[s.length];
        for(int i=0; i<s.length; i++) {
            if(s[i] == 'A' || s[i] == 'C' || s[i] == 'G' || s[i] == 'T') {
                acgt[i] = 1;
            }
        }
        int cnt = 0;
        for(int i=0; i<acgt.length; i++) {
            if(acgt[i] == 1) {
                cnt += 1;
            } else {
                cnt = 0;
            }
            ans = Math.max(cnt,ans);
        }
        System.out.println(ans);
    }
}
