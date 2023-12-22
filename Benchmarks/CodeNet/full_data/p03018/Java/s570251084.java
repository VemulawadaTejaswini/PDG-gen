import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String state = "ZZZ";
        char[] C = new char[S.length()];
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            C[i] = c;
            state = state + String.valueOf(c);
            state = state.substring(1, 4);
            // ABCが揃った時点でBCAに変換
            if(state.equals("ABC")){
                state = "BCA";
                C[i - 2] = 'B';
                C[i - 1] = 'C';
                C[i] = 'A';
                count++;
                // 直前にAが何個繋がっているか確認
                int aCnt = 0;
                if(i - 3 > 0){
                    for(int j = i - 3; j >= 0; j--){
                        if(C[j] == 'A'){
                            aCnt++;
                        }else{
                            break;
                        }
                    }
                }
                count += aCnt;
            }
        }
        System.out.println(count);
    }
}
