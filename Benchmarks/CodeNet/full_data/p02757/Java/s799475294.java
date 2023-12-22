import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        char[] s = sc.next().toCharArray();
        long ans = 0;
        if(10 % p == 0){
            for(int i = n-1; i >= 0; i--){
                if((s[i] - '0') % p == 0){
                    ans += i+1;
                }
            }
        }else{
            int[] cum = new int[n+1];
            int pow = 1;
            for(int i = n-1; i >= 0; i--){
                int tmp = ((s[i] - '0') * pow) % p;
                cum[i] = (cum[i+1]+tmp) % p;
                pow *= 10;
                pow %= p;
            }
            int[] counter = new int[p];
            for(int i = n; i >= 0; i--){
                ans += counter[cum[i]];
                counter[cum[i]]++;
            }
        }
        System.out.println(ans);
    }
}
