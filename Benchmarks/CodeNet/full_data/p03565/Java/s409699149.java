import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int a_len = a.length();
        int b_len = b.length();
        int after_flg = 0;
        String ans = a;

        for (int i = 0; i < a_len - b_len + 1; i++){

            String substr = a.substring(i,i+b_len);
            int ikeru = 0;
            for (int j = 0; j<b_len; j++){
                if ((substr.charAt(j) != b.charAt(j)) && '?' != substr.charAt(j)) {
                    break;
                }
                if ((substr.charAt(j) == b.charAt(j)) || '?' == substr.charAt(j)) {
                    ikeru++;
                }
            }
            if (ikeru == b_len){
                after_flg = 1;
                ans = ans.replace(a.substring(i,i+b_len),b);
                break;
            }
        }
        if (after_flg == 0) System.out.println("UNRESTORABLE");
        else {
            ans = ans.replace("?","a");
            System.out.println(ans);
        }
    }
}
