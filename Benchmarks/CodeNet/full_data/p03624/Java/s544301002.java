import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean found;
        for (char c='a'; c<='z'; c++) {
            found = false;
            for (int i=0; i<s.length(); i++) {
                if ( s.charAt(i) == c ) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("None");
    }
}