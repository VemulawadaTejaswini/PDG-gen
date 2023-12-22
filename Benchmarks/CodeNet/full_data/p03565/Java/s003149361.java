import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int indexT = t.length()-1;
        int ansIndex = -1;
        for(int indexS = s.length()-1; indexS >= 0; indexS--) {
            if(indexT == 0 && (s.charAt(indexS) == t.charAt(indexT) || s.charAt(indexS) == '?')) {
                ansIndex = indexS;
                break;
            }
            if(s.charAt(indexS) != '?' && s.charAt(indexS) != t.charAt(indexT)) {
                indexT = t.length()-1;
            } else {
                indexT--;
            }
        }
        if(ansIndex != -1) {
            for(int i = 0; i < s.length(); i++) {
                if(i == ansIndex) {
                    System.out.print(t);
                    i += t.length() - 1;
                } else {
                    char c = s.charAt(i);
                    if(c == '?') System.out.print('a');
                    else System.out.print(c);
                }
            }
            System.out.println();
        } else {
            System.out.println("UNRESTORABLE");
        }
    }
}
