import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String state = "ZZZ";
        boolean a = false;
        int aCnt = 0;
        char[] C = new char[S.length()];
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            C[i] = c;
            if(c == 'A'){
                if(!a){
                    aCnt = 1;
                    a = true;
                }else{
                    aCnt++;
                }
            }else{
                a = false;
            }
            state = state + String.valueOf(c);
            state = state.substring(1, 4);
            // ABCが揃った時点でBCAに変換
            if(state.equals("ABC")){
                state = "BCA";
                count += aCnt;
                a = true;
            }
        }
        System.out.println(count);
    }
}
