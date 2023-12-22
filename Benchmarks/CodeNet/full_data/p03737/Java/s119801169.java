import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s[] = inp.nextLine().split(" ");
        char x[] = map(s);
        // 32
        int d = 0;
        for (int i = 0; i < 3; i++) {
            d = ((int)x[i]) - 32;
            System.out.print((char)d);
        }
        System.out.println();
    }
    public static char[] map(String s[]) {
        char res[] = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            res[i] = s[i].toCharArray()[0];
        }
        return res;
    }
}