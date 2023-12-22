import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        if(str[0]==str[1]){
            if(str[2]==str[3]&&str[1]!=str[2]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else if(str[0]==str[2]){
            if(str[1]==str[3]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else if(str[0]==str[3]){
            if(str[1]==str[2]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }       
}




