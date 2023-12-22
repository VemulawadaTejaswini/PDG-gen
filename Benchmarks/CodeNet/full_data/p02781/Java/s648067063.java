import java.util.*;

class Main {
    // ABC152D
    static final long MOD = 1_000_000_007;
    // 10^9+7
    //static final int MAX = 2_147_483_646;
    static final int MAX = 10_000_000;
    // intの最大値
    static final int INF = 1_000_000_000;
    // 10^9

  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        int k = sc.nextInt();
        long ans = 0;
        switch(k){
            case 1:
                ans = 9*(s.length()-1);
                ans += s.charAt(0)-48;
                break;
            case 2:
                if(s.length() < 2)break;
                ans = 9*9*(s.length()-1)*(s.length()-2)/2;
                ans += (str[0]-49)*9*(s.length()-1);
                char st = '1';
                int p = 0;
                for(int i = 1;i < s.length();i++){
                    if(str[i]!='0'){
                        st = str[i];
                        p = i;
                        break;
                    }
                }
                ans += st -48;
                ans += 9 * (s.length()-1-p);
                break;
            case 3:
                if(s.length() < 3)break;
                //9^3*(n-1)C3
                ans = 9*9*9*(s.length()-1)*(s.length()-2)*(s.length()-3)/6;
                //9^2*(n-1)C2*(a-1)
                ans += (str[0]-49)*9*9*(s.length()-1)*(s.length()-2)/2;
                char c = '1';
                int q = 0;
                for(int i = 1;i < s.length();i++){
                    if(str[i]!='0'){
                        c = str[i];
                        q = i;
                        break;
                    }
                }
                //最大桁固定
                //次の0以外が来たら固定
                ans += (c-49)*9*(s.length()-1-q)/2;
                for(int i = q;i < s.length();i++){
                    if(str[i]!='0'){
                        c = str[i];
                        q = i;
                        break;
                    }
                }
                ans += c-'0';
                ans += 9*(s.length()-1-q);
                break;
            default:
                break;
        }
        System.out.println(ans);
    }
    
}


