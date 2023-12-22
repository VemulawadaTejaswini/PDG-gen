import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char[] c = str.toCharArray();
        String str2 = sc.next();
        int n2 = str2.length();
        
        if (n < n2) {
            System.out.println("UNRESTORABLE");
            return;
        }
        
        int index = -1;
        for (int i = n - n2; i >= 0; i--) {
            boolean end = true;
            for (int j = 0; j < n2; j++) {
                if (c[i + j] == '?') continue;
                if (c[i + j] != str2.charAt(j)) {
                    end = false;
                    break;
                }
            }
            
            if (end) {
                index = i;
                break;
            } else if (i == 0) {
                System.out.println("UNRESTORABLE");
                return;
            }
        }
        
        for (int i = index; i < index + n2; i++) {
            c[i] = str2.charAt(i - index);
        }
        
        for (char chr : c) {
            if (chr == '?') {
                System.out.print('a');
            } else {
                System.out.print(chr);
            }
        }
        System.out.println();
    }
}
