import java.util.*;

class Main {
    // 150d
    static final long MOD = 1_000_000_007;
    static final int MAX = 2000000000;
    static final int INF = 100000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        sc.close();
        char index = str[0];
        //int[] num = new int[n];
        //int m = 0;
        int ans = 0;
        int fwhite = 0;
        boolean brack = true;
        for(int i = 0;i < n;i++){
            if(str[i] == '.')ans++;
            if(brack&&str[i]!=index){
                brack = false;
            }
            if(brack&&str[i] == '.')fwhite++;
        }
        int bnum = 0;
        for(int i = n-1;i > 0;i--){
            if(str[i] == '#'){
                bnum++;
            }else{
                break;
            }
        }
        
        if(ans - fwhite> n - ans - bnum){
            ans = n - ans - bnum;
        }else{
            ans -= fwhite;
        }
        System.out.println(ans);
    }
}
