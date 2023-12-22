
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        char[] cArr = S.toCharArray();
        long[] down = new long[S.length() + 1];
        long[] up = new long[S.length() + 1];
        long[] ans = new long[S.length() + 1];

        long temp = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            if(cArr[i] == '>'){
                temp ++;
            }else{
                temp = 0;
            }
            down[i] = temp;
        }
        temp = 0;
        for (int i = 1; i <= S.length(); i++) {
            if(cArr[i-1] == '<'){
                temp ++;
            }else{
                temp = 0;
            }
            up[i] = temp;
        }

        for (int i = 0; i < S.length()+1; i++) {
            ans[i] = Math.max(up[i], down[i]);
        }

        long result = 0;
        for(long l : ans){
            result += l;
        }

        //System.out.println(Arrays.toString(up));
        //System.out.println(Arrays.toString(down));
        //System.out.println(Arrays.toString(ans));
        System.out.println(result);

    }

}
