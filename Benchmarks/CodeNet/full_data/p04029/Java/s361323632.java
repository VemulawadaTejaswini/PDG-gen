import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String ans = "";
        for(int i=0; i<s.length(); i++) {
            switch(s.charAt(i)) {
            case '0':
                ans = ans.concat("0");
                break;
            case '1':
                ans = ans.concat("1");
                break;
            case 'B':
                if(ans == "") {
                    break;
                } else {
                    ans = ans.substring(0, i-1);
                }
            default:
                break;
            }
        }

        System.out.println(ans);

        in.close();
    }
}
