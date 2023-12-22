import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean flg = false;
        int cCount = 0;
        for(int i = 0; i < S.length(); i++) {
            if(i == 0 && S.charAt(0) == 'A') {
                //一文字目
                flg = true;
            } else if(i >= 2 && i <= S.length()-2 && S.charAt(i) == 'C') {
                flg = true;
                cCount += 1;
                if(cCount != 1) {
                    flg = false;
                    break;
                }
            } else if(!Character.isUpperCase(S.charAt(i))){
                flg = true;
            } else {
                flg = false;
                break;
            }
        }
        if(flg && cCount == 1) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}