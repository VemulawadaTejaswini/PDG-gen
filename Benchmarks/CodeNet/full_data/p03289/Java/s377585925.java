import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] ch = sc.next().toCharArray();
        String ans = "AC";
        
        if (ch[0] != 'A') {
            ans = "WA";
        } else {
            int index = 0;
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] == 'C') {
                    index = i;
                }
            }
            if (!(index >= 2 && index <= ch.length - 2)) ans = "WA";
            for (int i = 1; i < index; i++) {
                if (!(ch[i] >= 97 && ch[i] <= 122)) ans = "WA";
            }
            for (int i = index + 1; i < ch.length; i++) {
                if (!(ch[i] >= 97 && ch[i] <= 122)) ans = "WA";
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}