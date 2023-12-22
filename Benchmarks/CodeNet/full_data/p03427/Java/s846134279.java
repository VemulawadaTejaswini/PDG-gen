import java.util.*;

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String out = "";
        if(s.length == 1) {
            System.out.println(s);
        } else {
            if(s.charAt(0) != '1')
            out += String.valueOf(((char)(s.charAt(0) - 1)));
            for(int i = 1; i < s.length(); i++) {
                out += "9";
            }
            int ans = 0;
            for(int i = 0; i < out.length(); i++) {
                ans += out.charAt(i) - '0';
            }
            System.out.println(ans);
    
        }

    }
}

