import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String dream = "maerd";
        String dreamer = "maerder";
        String erase = "esare";
        String eraser = "resare";
        StringBuilder sv = new StringBuilder(s);
        s = sv.reverse().toString();
        boolean flg = true;
        for(int i = 0; i <s.length();) {
            if ( i == s.length() - 1) break;
            if ( 5 > s.length() - i) {
                flg = false;
                break;
            }
            if(i + 6 < s.length() && eraser.equals(s.substring(i, i + 6))) {
                i += 6;
                continue;
            }
            if(erase.equals(s.substring(i, i + 5))) {
                i += 5;
                continue;
            }
            d: if(i + 7 < s.length() && dreamer.equals(s.substring(i, i + 7))) {
                i+=7;
                continue;
            }
            if(dream.equals(s.substring(i, i +5))){
                i += 5;
                continue;
            }
            flg = false;
            break;
        }
        if(flg) {
            System.out.println("YES");
        }else {
            System.out.println("No");
        }
    }
}
