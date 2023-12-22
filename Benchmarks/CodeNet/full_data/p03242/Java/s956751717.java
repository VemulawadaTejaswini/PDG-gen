import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(char c: str.toCharArray()) {
            if(c == '1') ans += '9';
            else if(c == '9') ans += '1';
            else ans += c;
        }
        System.out.println(ans);
    }
}