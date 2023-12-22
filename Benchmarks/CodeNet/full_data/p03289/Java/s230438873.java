import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean flg = true;
        int cCount = 0;
        for(int i = 0; i < S.length(); i++) {
            if(i == 0) {
                //一文字目
                if(!(S.charAt(0) == 'A')) {
                    flg = false;
                    break;
                }
            } else if(i >= 2 && i <= S.length()-2) {
                //先頭3文字目 ~ 後ろから2文字目
                if(S.charAt(i) == 'C') {
                    if(cCount != 0) {
                        flg = false;
                        break;
                    } else {
                        cCount += 1;
                    }
                } else {
                    if(Character.isUpperCase(S.charAt(i))) {
                        flg = false;
                        break;
                    }
                }
            } else {
                //それ以外
                if(Character.isUpperCase(S.charAt(i))) {
                    flg = false;
                    break;
                }
            }
        }
        if(flg && cCount == 1) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}