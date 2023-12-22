import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        String s;
        int g = 0;
        for (int index = 0; index < v.length(); index++) {
            if (v.charAt(index) != 'W' && v.charAt(index) != 'B') {
                g++;
            }
        }
        if (g != 0) {
            s = sc.nextLine();
        } else {
            s = v;
        }
        int c = s.codePointAt(0);
        int n = 0;
        for (int index = 1; index < s.length(); index++) {
            if (c != s.codePointAt(index)) {
                n++;
                c = s.codePointAt(index);
            }
        }
        System.out.println(n);
    }
}
