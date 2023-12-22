import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] li = new int[s.length];
        for(int i = 0; i < s.length; i++){
            li[i] = Character.getNumericValue(s[i]);
        }
        for(int i = 0; i < 2; i++){
            int tmp1 = i == 0 ? li[0] + li[1] : li[0] - li[1];
            for(int j = 0; j < 2; j++){
                int tmp2 = j == 0 ? tmp1 + li[2] : tmp1 - li[2];
                for(int k = 0; k < 2; k++){
                    int chk = k == 0 ? tmp2 + li[3] : tmp2 - li[3];
                    if(chk == 7){
                        String op1 = i == 0 ? "+" : "-";
                        String op2 = j == 0 ? "+" : "-";
                        String op3 = k == 0 ? "+" : "-";
                        System.out.println(li[0] + op1 + li[1] + op2 + li[2] + op3 + li[3] +  "=7");
                        return;
                    }
                }
            }
        }
    }
}
