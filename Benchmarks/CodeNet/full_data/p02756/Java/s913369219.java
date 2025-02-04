import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        boolean rev = true;
        for(int i = 0;i < n;i++){
            int t = sc.nextInt();
            if(t==1){
                if(rev){
                    rev = false;
                }else{
                    rev = true;
                }
            }else{
                int f = sc.nextInt();
                String c = sc.next();
                if(rev){
                    if(f==1){
                        c+=s;
                        s=c;
                    }else{
                        s+=c;
                    }
                }else{
                    if(f==1){
                        s+=c;
                    }else{
                        c+=s;
                        s = c;
                    }
                }
            }
        }
        if(!rev){
            StringBuffer str = new StringBuffer(s);
            System.out.println(str.reverse().toString());
        }else{
            System.out.println(s);
        }
    }
}

